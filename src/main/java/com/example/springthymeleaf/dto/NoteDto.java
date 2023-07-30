package com.example.springthymeleaf.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import lombok.Data;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@ToString
public class NoteDto {
  private String title;

  private String description;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date beginDate;

  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date endDate;
}
