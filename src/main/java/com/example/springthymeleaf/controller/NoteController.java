package com.example.springthymeleaf.controller;

import com.example.springthymeleaf.dto.NoteDto;
import com.example.springthymeleaf.service.NoteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class NoteController {

  @Autowired
  private NoteService service;

  @GetMapping("/")
  public ModelAndView indexPage(Model model) {
    log.info("Notes is " + service.getNotes());
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
    log.info("Note object form = " + dto);

    service.addNote(dto);
    return new ModelAndView("redirect:/");
  }
}
