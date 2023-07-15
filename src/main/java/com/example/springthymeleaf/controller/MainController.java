package com.example.springthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springthymeleaf.model.Expertise;

@Controller
public class MainController {

  @GetMapping
  public ModelAndView indexPage(ModelMap model) {
    List<String> menus = List.of("about us", "services", "pricing", "blog", "contact");
    model.put("menus", menus);
    model.put("expertises", expertises());
    return new ModelAndView("index", model);
  }

  private List<Expertise> expertises() {
    List<Expertise> results = new ArrayList<>();
    Expertise expertise;

    // 1
    expertise = new Expertise();
    expertise.setName("Expertise");
    expertise.setDescription(
        "Our team of experienced experts have the knowledge and expertise to deliver innovative IT solutions that meet your unique needs.");
    expertise.setImage("images/expertise.svg");
    results.add(expertise);

    // 2
    expertise = new Expertise();
    expertise.setName("Technology");
    expertise.setDescription(
        "We stay up to date with the latest trends and technologies in the IT industry, so you can get the most advanced solutions available.");
    expertise.setImage("images/technology.svg");
    results.add(expertise);

    // 3
    expertise = new Expertise();
    expertise.setName("Solutions");
    expertise.setDescription(
        "We take a personalized approach to every project, working closely with you to understand your business and create solutions.");
    expertise.setImage("images/solution.svg");
    results.add(expertise);

    // 4
    expertise = new Expertise();
    expertise.setName("Results");
    expertise.setDescription(
        "Our track record speaks for itself – we've helped businesses of all sizes and industries achieve their goals with our IT solutions.");
    expertise.setImage("images/result.svg");
    results.add(expertise);

    return results;
  }
}
