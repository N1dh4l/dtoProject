package dev.dto.dtoApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course{
    
    @Id
    private Long id;
    private String name;
    private String cost;
    private String time;

    public Course(){}

    public Course( Long id,String name, String cost, String time){
        this.id = id;
        this.name= name;
        this.cost = cost;
        this.time = time;
    }
}