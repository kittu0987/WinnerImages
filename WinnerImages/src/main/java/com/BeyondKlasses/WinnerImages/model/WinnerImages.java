package com.BeyondKlasses.WinnerImages.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class WinnerImages {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String email;
    private String city;
    private String school;
    private Integer age;
    private Integer compyear;
    private String profilelink;
    private String sponsor;
    private String videoLink;
    private String dynamicPage;
    private String description;
    private String title;
    private String status;
    private String month;

}
