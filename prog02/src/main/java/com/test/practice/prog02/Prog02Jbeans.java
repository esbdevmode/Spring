package com.test.practice.prog02;

import java.io.Serializable;

public class Prog02Jbeans implements Serializable{
    /*
     * Needs to create below threee steps to achive  Java beans [EJB - Enterprise Java Beans]
     * 1. implements Serializable
     * 2. Access the artifacts, need to have getter and setter methods
     * 3. No -arg constructor
     */
    public Prog02Jbeans(){
        System.out.println("I am a Prog02Jbeans constructor");
    }

     private String nature;

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    
    
}
