package com.lambdaschool.javazoos.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="zoos")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long zooid;

    @Column(nullable = false, unique = true)
    String zooname;

    @OneToMany(mappedBy = "zoo", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnoreProperties(value = "zoo", allowSetters = true)
    private List<Telephone> tele = new ArrayList<>();

    public Zoo() {
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }
}
