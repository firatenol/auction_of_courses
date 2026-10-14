package ru.rut_miit.course_auction.models;

public record Course(int id,int authorID,String authorName, String label, int priceAtStart, int currentPrice, String description) {
    
}
