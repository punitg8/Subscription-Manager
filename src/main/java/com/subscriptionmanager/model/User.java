package com.subscriptionmanager.model;

import com.subscriptionmanager.enums.Role;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
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
@SQLDelete(sql = "UPDATE user SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@Entity
@Table(name = "user")
public class User extends Audit implements Serializable {

  @Serial
  private static final long serialVersionUID = 101;

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
