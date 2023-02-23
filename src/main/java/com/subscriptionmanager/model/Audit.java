package com.subscriptionmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import java.io.Serializable;
import java.sql.Timestamp;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.Where;

@Data
@MappedSuperclass
public class Audit implements Serializable {

  @Id
  @Column(name = "id", length = 36)
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  private String id;

  @CreationTimestamp
  private Timestamp createDateTime;

  @UpdateTimestamp
  private Timestamp updateDateTime;

  private boolean deleted;

}
