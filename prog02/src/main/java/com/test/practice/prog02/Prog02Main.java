package com.test.practice.prog02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Prog02Main {
    
    public static void main(String[] args) {
        // A normal POJO 
        var pojoHolder = new Prog02Pojo();
        System.out.println(pojoHolder);
        pojoHolder.nature();
        
        // A Java Beans
        var jbeansHolder = new Prog02Jbeans();
        jbeansHolder.setNature("I am calling from main");
        System.out.println(jbeansHolder.getNature());

        // A Spring Bean
        /*
        * Need to create a context - isolated spring space for Spring application*/
        var sbeanholder = new AnnotationConfigApplicationContext(Prog02Sbeans.class);
        System.out.println(sbeanholder.getBean("mynature")); 
    }   

    
}
