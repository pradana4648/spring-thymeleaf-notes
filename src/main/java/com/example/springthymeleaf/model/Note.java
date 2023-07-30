package com.example.springthymeleaf.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.util.Date;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Data
@Entity
@Table(name = "notes")
public class Note {
  @Id
  @GeneratedValue
  @Column(name = "note_id", nullable = false)
  private String id;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @CreatedDate
  @Column(name = "created_at")
  @Temporal(TemporalType.DATE)
  private Date createdAt;

  @LastModifiedDate
  @Column(name = "updatedAt")
  @Temporal(TemporalType.DATE)
  private Date updatedAt;

  @Column(name = "begin_date")
  @Temporal(TemporalType.DATE)
  private Date beginDate;

  @Column(name = "end_date")
  @Temporal(TemporalType.DATE)
  private Date endDate;
}
