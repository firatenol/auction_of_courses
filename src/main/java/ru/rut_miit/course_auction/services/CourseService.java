package ru.rut_miit.course_auction.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.rut_miit.course_auction.interfaces.CourseServiceInterface;
import ru.rut_miit.course_auction.interfaces.CoursesCatalogInterface;
import ru.rut_miit.course_auction.models.Course;
import ru.rut_miit.course_auction.services.exceptions.CourseNotFoundException;

@Service 
public class CourseService implements CourseServiceInterface{
    private final CoursesCatalogInterface courseCatalog;

    public CourseService(CoursesCatalogInterface courseCatalog){
        this.courseCatalog = courseCatalog;
    }
    @Override
    public List<Course> allCourses() {
        return courseCatalog.findAllCourses();
    }

    @Override
    public Course courseDetails(int id) {
        try{
            return courseCatalog.courseDetails(id);
        }catch (Exception e){
            throw new CourseNotFoundException(id);
        }
    }
    
}
