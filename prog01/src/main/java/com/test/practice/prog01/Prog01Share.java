package com.test.practice.prog01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Prog01Share {
    
    public static void main(String[] args) {
        
        var sharecontext = new AnnotationConfigApplicationContext(Config01.class);

        System.out.println(sharecontext.getBean("setFlags"));
    }
}
