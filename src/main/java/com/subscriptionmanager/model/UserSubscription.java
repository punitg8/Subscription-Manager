package com.subscriptionmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@SQLDelete(sql = "UPDATE user_subscription SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@Entity
@Table(name = "user_subscription",
    indexes = @Index(name = "user_sub_ind",columnList = "user_id, subscription_id"))
public class UserSubscription extends Audit implements Serializable {

  @Serial
  private static final long serialVersionUID = 101;

  @NotNull
  @Column(name = "expiry_date", nullable = false)
  private Date expiryDate;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  @NotNull
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "subscription_id", referencedColumnName = "id")
  private Subscription subscription;

}
