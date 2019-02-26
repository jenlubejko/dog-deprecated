package com.jennifer.dog.repositories;

import com.jennifer.dog.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
