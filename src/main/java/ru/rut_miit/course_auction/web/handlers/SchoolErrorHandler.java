package ru.rut_miit.course_auction.web.handlers;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import ru.rut_miit.course_auction.services.exceptions.SchoolNotFoundException;

@ControllerAdvice
public class SchoolErrorHandler {
    @ExceptionHandler(SchoolNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String schoolNotFound(SchoolNotFoundException exception, Model model) {
        model.addAttribute("errorMessage", exception.getMessage());
        return "error/school-not-found";
    }
}