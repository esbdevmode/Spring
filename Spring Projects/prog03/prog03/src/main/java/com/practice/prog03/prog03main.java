package com.practice.prog03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class prog03main {
    
    //main
    public static void main(String[] args) {

        //starting point
        System.out.println("I am main body");

        //Create a Spring context
        /*In this below line, calling the AnnotationConfigApplicationContext constructor by passing a class, called as injection */
        var mainobj = new AnnotationConfigApplicationContext( prog03Config.class);

        //System.out.println(mainobj.getBean("EmployeeID"));
        //System.out.println(mainobj.getBean("EmployeeName"));

        //System.out.println(mainobj.getBean("empInfo"));

        //System.out.println(mainobj.getBean("Indetails"));

        //Calling the bean with @primary and @qualifier tag
        System.out.println(mainobj.getBean("IndetailsQuali"));

        //Passing the class as an argument 
        //System.out.println(Address.class);
        
        


    }
}
