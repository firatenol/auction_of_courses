package ru.rut_miit.course_auction.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.rut_miit.course_auction.interfaces.CourseServiceInterface;

@Controller
@RequestMapping("/courses") 
public class CourseController {
    private final CourseServiceInterface courseService;

    public CourseController(CourseServiceInterface courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String allCourses(Model model) {
        model.addAttribute("coursesInfo", courseService.allCourses());
        return "courses";
    }

    @GetMapping("/{courseId}")
    public String courseDetails(
            @PathVariable int courseId,
            Model model
    ) {
        
        model.addAttribute("course", courseService.courseDetails(courseId));
        return "course-details"; 
    }
}