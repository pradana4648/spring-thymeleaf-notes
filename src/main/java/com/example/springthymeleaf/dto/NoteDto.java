package com.example.springthymeleaf.dto;

import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

public class NoteDto {
  private String title;

  private String description;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date beginDate;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date endDate;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getBeginDate() {
    return beginDate;
  }

  public void setBeginDate(Date beginDate) {
    this.beginDate = beginDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }
}
