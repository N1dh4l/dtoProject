package dev.dto.dtoApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
    
    @Id
    private Long id;
    private String name;
    private String age;

    public Student(){
    }
    public Student(Long id,String name,String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}
