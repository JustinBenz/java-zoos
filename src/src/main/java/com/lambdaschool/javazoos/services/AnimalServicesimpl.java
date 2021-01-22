package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.repositories.AnimalsRepository;
import com.lambdaschool.javazoos.views.countAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service(value = "animalService")
public class AnimalServicesimpl implements AnimalServices{

    @Autowired
    private AnimalsRepository animalrepos;

//    @Override
//    public List<countAnimal> countAnimals() {
//        return animalrepos.countAnimals();
//    }
}
