package ru.rut_miit.course_auction.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ru.rut_miit.course_auction.interfaces.SchoolCatalogInterface;
import ru.rut_miit.course_auction.interfaces.SchoolServiceInterface;
import ru.rut_miit.course_auction.models.School;
import ru.rut_miit.course_auction.services.exceptions.SchoolNotFoundException;

@Service 
public class SchoolService implements SchoolServiceInterface {
    private final SchoolCatalogInterface schoolCatalog;
    public SchoolService(SchoolCatalogInterface schoolCatalog){

        this.schoolCatalog = schoolCatalog;
    }
    @Override
    public List<School> findAllSchools() {
        return schoolCatalog.findAllSchools();
    }

    @Override
    public School schoolDetails(int id) {
        try{
            return schoolCatalog.schoolDetails(id);
        }catch (Exception e){
            throw new SchoolNotFoundException(id);
        }
    }
    
}
