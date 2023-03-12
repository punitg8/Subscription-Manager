package com.subscriptionmanager.model;

import com.subscriptionmanager.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
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
@AllArgsConstructor
@Where(clause = "is_active=true")
@Entity
@Table(name = "user")
public class User extends Audit implements Serializable {

  @Serial
  private static final long serialVersionUID = 101;

  @Id
  @Column(name = "id", length = 36)
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @NotBlank
  @Column(name = "name")
  private String name;

  @NotBlank
  @Column(name = "email_id", nullable = false, unique = true)
  private String emailId;

  @NotBlank
  @Column(name = "password", nullable = false)
  private String password;

  @NotNull
  @Enumerated(EnumType.STRING)
  @Column(name = "role", nullable = false, length = 20)
  private Role role;

  @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
  private Set<UserSubscription> userSubscriptions;

}
