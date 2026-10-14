package ru.rut_miit.course_auction.catalog;

import java.util.List;

import org.springframework.stereotype.Repository;


import ru.rut_miit.course_auction.interfaces.CoursesCatalogInterface;
import ru.rut_miit.course_auction.models.Course;

@Repository 
public class InMemoryCourseRepository implements CoursesCatalogInterface{
    private final List<Course> listCourses = List.of(
        new Course(0,
            1,
            "Яндекс.Практикум",
            "Курсы Mlops",
            10000,
            7890,
            "Курсы, которые сделаю из вас настоящего Mlops инженера"
        ),
        new Course(1,
            1,
            "Яндекс.Практикум",
            "Курсы Java Backend",
            20000,
            7490,
            "Курсы, которые сделаю из вас настоящего Backend инженера"
        ),
        new Course(2,
            1,
            "Яндекс.Практикум",
            "Курсы AI Engineer",
            45000,
            23444,
            "Курсы, которые сделаю из вас настоящего AI инженера"
        )
    );
    @Override
    public List<Course> findAllCourses() {
        return listCourses;
    }
    @Override
    public Course courseDetails(int id) {
        return listCourses.get(id);
    }
    
}
