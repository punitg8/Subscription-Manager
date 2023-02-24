package com.subscriptionmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@SQLDelete(sql = "UPDATE genre SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@Entity
@Table(name = "genre")
public class Genre extends Audit implements Serializable {

  @Serial
  private static final long serialVersionUID = 101;

  @NotBlank
  @Column(name = "name")
  private String name;

  @OneToMany(mappedBy = "genre")
  private Set<News> news;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "subscription_id", referencedColumnName = "id")
  private Subscription subscription;


}
