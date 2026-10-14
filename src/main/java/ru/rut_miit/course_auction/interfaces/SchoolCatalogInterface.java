package ru.rut_miit.course_auction.interfaces;

import java.util.List;

import ru.rut_miit.course_auction.models.School;

public interface SchoolCatalogInterface {
    public List<School> findAllSchools();
    School schoolDetails(int id);
}
