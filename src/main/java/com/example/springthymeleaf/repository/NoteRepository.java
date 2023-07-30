package com.example.springthymeleaf.repository;

import com.example.springthymeleaf.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends CrudRepository<Note, String> {
}
