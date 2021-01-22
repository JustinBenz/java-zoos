package com.lambdaschool.javazoos.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long phoneid;


    String phonetype;
    String phonenumber;

    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    @JsonIgnoreProperties(value = "telephone", allowSetters = true)
    private Zoo zoo;

    public Telephone() {

    }

    public Telephone(String phonetype, String phonenumber) {
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
