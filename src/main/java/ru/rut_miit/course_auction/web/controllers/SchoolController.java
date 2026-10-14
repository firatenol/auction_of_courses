package ru.rut_miit.course_auction.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.rut_miit.course_auction.interfaces.SchoolServiceInterface;

@Controller 
@RequestMapping("/schools") 
public class SchoolController {
    private final SchoolServiceInterface schoolService;

    public SchoolController(SchoolServiceInterface schoolService) {
        this.schoolService = schoolService;
    }

    @GetMapping
    public String allSchools(Model model) {
        model.addAttribute("schoolInfo", schoolService.findAllSchools());
        return "schools";
    }

    @GetMapping("/{schoolId}")
    public String schoolDetails(
            @PathVariable int schoolId,
            Model model
    ) {
        model.addAttribute("school", schoolService.schoolDetails(schoolId));
        return "school-details"; 
    }
}
