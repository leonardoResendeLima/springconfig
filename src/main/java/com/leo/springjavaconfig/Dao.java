package com.leo.springjavaconfig;

import org.springframework.stereotype.Component;

@Component
public class Dao {

    public void create() {
        System.out.println("Created");
    }

    public void init(){
        System.out.println("Inside init()");
    }

    public void destroy(){
        System.out.println("Inside destroy()");
    }
}
