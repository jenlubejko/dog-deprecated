package com.jennifer.pet.repositories;

import com.jennifer.pet.models.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
