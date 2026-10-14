package ru.rut_miit.course_auction.interfaces;

import java.util.List;

import ru.rut_miit.course_auction.models.Course;

public interface CourseServiceInterface {
    List<Course> allCourses();
    Course courseDetails(int id);
}
