package com.subscriptionmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Where(clause = "is_active=true")
@AllArgsConstructor
@Entity
@Table(name = "subscription")
public class Subscription extends Audit implements Serializable {

  @Serial
  private static final long serialVersionUID = 101;

  @Id
  @Column(name = "id", length = 36)
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @NotBlank
  @Column(name = "name", unique = true)
  private String name;

  @NotNull
  @Column(name = "price")
  private int price;

  //In no of days
  @NotNull
  @Column(name = "validity")
  private int validity;

  @OneToMany(mappedBy = "subscription")
  private Set<Genre> genre;

  @OneToMany(mappedBy = "subscription")
  private Set<UserSubscription> userSubscriptions;

}
