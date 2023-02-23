package com.subscriptionmanager.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
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
@SQLDelete(sql = "UPDATE news SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")
@Entity
@Table(name = "news")
public class News extends Audit implements Serializable {

  @NotBlank
  @Column(name = "title")
  private String title;

  @NotBlank
  @Column(name = "description")
  private String description;

  @NotNull
  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "genre_id", referencedColumnName = "id")
  private Genre genre;

}