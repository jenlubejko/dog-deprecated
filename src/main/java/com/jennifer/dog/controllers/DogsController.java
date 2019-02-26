package com.jennifer.dog.controllers;

import com.jennifer.dog.models.Dog;
import com.jennifer.dog.repositories.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/dogs")
public class DogsController {
    @Autowired
    private DogRepository dogRepository;

    @GetMapping
    public List<Dog> list() {
        return dogRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Dog dog) {
        dogRepository.save(dog);
    }

    @GetMapping("/{id}")
    public Dog get(@PathVariable("id") long id) {
        return dogRepository.getOne(id);
    }
}
