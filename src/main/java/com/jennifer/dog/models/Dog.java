package com.jennifer.dog.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Dog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String identification;
    private String breed;
    private String origin;
    private BigDecimal weight;
    private BigDecimal age;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date intakeDate;
    private boolean reproductive;

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }

    public String getBreed() {
        return breed;
    }

    public String getOrigin() {
        return origin;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public BigDecimal getAge() {
        return age;
    }

    public Date getIntakeDate() {
        return intakeDate;
    }

    public boolean isReproductive() {
        return reproductive;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setAge(BigDecimal age) {
        this.age = age;
    }

    public void setIntakeDate(Date intakeDate) {
        this.intakeDate = intakeDate;
    }

    public void setReproductive(boolean reproductive) {
        this.reproductive = reproductive;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
