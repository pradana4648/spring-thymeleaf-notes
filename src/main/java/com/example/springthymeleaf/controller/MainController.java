package com.example.springthymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springthymeleaf.model.Expertise;
import com.example.springthymeleaf.model.Question;

@Controller
public class MainController {

  @GetMapping
  public ModelAndView indexPage(ModelMap model) {
    List<String> menus = List.of("about us", "services", "pricing", "blog", "contact");
    model.put("menus", menus);
    model.put("expertises", expertises());
    model.put("questions", questions());
    return new ModelAndView("index", model);
  }

  // List of Questions
  private List<Question> questions() {
    List<Question> results = new ArrayList<>();
    Question question;

    // 1
    question = new Question();
    question.setNumber(1);
    question.setName("What services does WaveNet offer?");
    question.setDescription(
        "Incididunt esse duis sint cillum fugiat veniam pariatur dolor ex ex cupidatat. Reprehenderit qui sint eu sit do elit proident pariatur. Amet aliqua eu aute commodo magna ipsum eiusmod ut ea.");
    results.add(question);

    // 2
    question = new Question();
    question.setNumber(2);
    question.setName("Which IT solution is for my business?");
    question.setDescription(
        "Occaecat sunt aliqua id consectetur reprehenderit. Dolore excepteur exercitation irure eiusmod Lorem ad anim culpa. Sunt dolor cillum sit anim ex labore consectetur. Nulla esse amet tempor excepteur ea do aliqua. Cillum voluptate eu reprehenderit nostrud esse sit minim laboris mollit elit duis. Reprehenderit quis Lorem do elit cillum exercitation qui veniam quis. Id aute sunt voluptate mollit.");
    results.add(question);

    // 3
    question = new Question();
    question.setNumber(3);
    question.setName("How much do the services cost?");
    question.setDescription(
        "Duis Lorem labore incididunt ex aliquip ut duis ullamco eu eu tempor. Ut eu Lorem aute laboris cupidatat ipsum Lorem deserunt velit. Incididunt proident anim mollit dolore non cillum exercitation ullamco nisi Lorem ex duis. Voluptate tempor fugiat excepteur sunt sunt enim sit enim do magna et magna adipisicing do. Nostrud officia enim id veniam non adipisicing ea est excepteur dolor nulla cillum. Incididunt tempor eu nulla amet quis qui ex et dolor amet occaecat. Sunt aliqua adipisicing nostrud consectetur sint id aliquip adipisicing labore Lorem.");
    results.add(question);

    // 4
    question = new Question();
    question.setNumber(4);
    question.setName("How do I get started with the IT solutions?");
    question.setDescription(
        "Nisi ea anim officia qui. Aute do voluptate in occaecat cillum. Elit eiusmod ipsum laboris officia sit dolore adipisicing cillum do. Aute aliqua nisi mollit ad ea deserunt mollit ea excepteur. Culpa non id non ullamco consequat pariatur deserunt. Qui sit et laboris laboris deserunt fugiat eiusmod qui ex incididunt mollit nulla dolor incididunt.");
    results.add(question);

    return results;
  }

  // List of Expertise
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
