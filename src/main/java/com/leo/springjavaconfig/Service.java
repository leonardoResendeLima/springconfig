package com.leo.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowired;

public class Service {

    @Autowired
    public Dao dao;

    public void save(){
        dao.create();
    }
}
