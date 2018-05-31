package com.example.demo.pojo;

import javax.persistence.*;

@Entity
@Table(name = "base_street")
public class BaseStreet{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String streetid;

    private String street;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String father;

    public String getStreetid() {
        return streetid;
    }

    public void setStreetid(String streetid) {
        this.streetid = streetid;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }
}