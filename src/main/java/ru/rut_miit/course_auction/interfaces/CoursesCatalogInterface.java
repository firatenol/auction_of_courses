package ru.rut_miit.course_auction.interfaces;

import java.util.List;

import ru.rut_miit.course_auction.models.Course;

public interface CoursesCatalogInterface {
    List<Course> findAllCourses();
    Course courseDetails(int id);
}
