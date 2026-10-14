package ru.rut_miit.course_auction.catalog;

import java.util.List;

import org.springframework.stereotype.Repository;

import ru.rut_miit.course_auction.interfaces.SchoolCatalogInterface;
import ru.rut_miit.course_auction.models.School;

@Repository 
public class InMemorySchoolRepository implements SchoolCatalogInterface {
    private final List<School> listCourses = List.of(
        new School(0, "It-school", 4, 4.5, "Прекрасная онлайн-школа для старта"),
        new School(1,"Яндекс.Практикум",3,4.8,"Эта школа сделает из Вас настоящего профессионала"),
        new School(2, "Skillbox", 2, 4.3, "Качественное IT-образование только у нас")
    );

    @Override
    public List<School> findAllSchools() {
        return listCourses;
    }

    @Override
    public School schoolDetails(int id) {
        return listCourses.get(id);
    }
}
