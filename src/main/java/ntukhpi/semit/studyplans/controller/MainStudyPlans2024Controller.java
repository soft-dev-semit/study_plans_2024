package ntukhpi.semit.studyplans.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
public class MainStudyPlans2024Controller {


    // handler method to handle list students and return mode and view
    @GetMapping("/")
    public String listEmployees(Model model) {

        return "studyPlans2024main";
    }

}
