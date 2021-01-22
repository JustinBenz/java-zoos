package com.lambdaschool.javazoos.repositories;

import com.lambdaschool.javazoos.models.Animal;
import com.lambdaschool.javazoos.views.countAnimal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AnimalsRepository extends CrudRepository<Animal, Long>{

//    List<countAnimal> countAnimals();

}
