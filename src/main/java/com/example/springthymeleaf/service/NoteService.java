package com.example.springthymeleaf.service;

import com.example.springthymeleaf.dto.NoteDto;
import com.example.springthymeleaf.model.Note;
import com.example.springthymeleaf.repository.NoteRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NoteService {
  @Autowired
  private NoteRepository repository;

  public Note addNote(NoteDto dto) {
    Note entity = new Note();
    entity.setTitle(dto.getTitle());
    entity.setDescription(dto.getDescription());
    entity.setBeginDate(dto.getBeginDate());
    entity.setEndDate(dto.getEndDate());
    return repository.save(entity);
  }

  public List<Note> getNotes() {
    final List<Note> result = new ArrayList<>();
    repository.findAll().forEach((note) -> result.add(note));
    return result;
  }
}
