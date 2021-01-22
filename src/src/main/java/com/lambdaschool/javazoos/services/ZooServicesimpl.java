package com.lambdaschool.javazoos.services;

import com.lambdaschool.javazoos.models.Zoo;
import com.lambdaschool.javazoos.repositories.ZoosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "zooService")
public class ZooServicesimpl implements ZooServices{

    @Autowired
    private ZoosRepository zoorepos;

    @Override
    public List<Zoo> findAllZoos(){
        List<Zoo> list = new ArrayList<>();

        zoorepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Override
    public Zoo findZooById(long zooid) throws EntityNotFoundException {
        return zoorepos.findById(zooid).orElseThrow(() -> new EntityNotFoundException("Zoo with " + zooid + "was not found!"));
    }


}
