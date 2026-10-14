package ru.rut_miit.course_auction.services.exceptions;


public class CourseNotFoundException extends RuntimeException {
    public CourseNotFoundException(int courseId) {
        super("Курс с айди '" + courseId + "' не найден");
    }
}