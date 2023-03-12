package com.subscriptionmanager.model;

import jakarta.persistence.MappedSuperclass;
import java.io.Serial;
import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@MappedSuperclass
public class Audit implements Serializable {

  @Serial
  private static final long serialVersionUID = 101;

  @CreationTimestamp
  private Timestamp createdAt;

  @UpdateTimestamp
  private Timestamp updatedAt;

  private boolean isActive = true;

}
