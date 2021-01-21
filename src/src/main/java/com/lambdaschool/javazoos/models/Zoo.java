package com.lambdaschool.javazoos.models;


import javax.persistence.*;

@Entity
@Table(name="zoos")
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long zooid;

    @Column(nullable = false, unique = true)
    String zooname;


    public Zoo() {
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }
}
