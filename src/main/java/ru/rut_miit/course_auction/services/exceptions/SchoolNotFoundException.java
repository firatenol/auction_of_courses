package ru.rut_miit.course_auction.services.exceptions;


public class SchoolNotFoundException extends RuntimeException {
    public SchoolNotFoundException(int schoolId) {
        super("Школа с айди '" + schoolId + "' не найдена");
    }
}