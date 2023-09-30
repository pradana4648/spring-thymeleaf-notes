package com.example.springthymeleaf.controller;

import com.example.springthymeleaf.dto.NoteDto;
import com.example.springthymeleaf.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NoteController {

  @Autowired
  private NoteService service;

  @GetMapping("/")
  public ModelAndView indexPage(Model model) {
    model.addAttribute("notes", service.getNotes());
    return new ModelAndView("index");
  }

  @GetMapping("/add")
  public ModelAndView addPage(Model model) {
    model.addAttribute("note", new NoteDto());
    return new ModelAndView("add");
  }

  @PostMapping("/add")
  public ModelAndView addNotePage(@ModelAttribute(name = "note") NoteDto dto) {
    if (dto.getDescription().isBlank()) {
      RestTemplate template = new RestTemplate();
      ResponseEntity<String> result = template.getForEntity("https://loripsum.net/api/3/short/plaintext", String.class);
      dto.setDescription(result.getBody());
    }
    service.addNote(dto);
    return new ModelAndView("redirect:/");
  }
}
