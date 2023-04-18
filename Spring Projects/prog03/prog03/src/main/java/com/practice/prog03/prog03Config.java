package com.practice.prog03;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Create A class for bewlo Employee Objects
record  Employee (int id, String name){

}

record Address(String state, String city){

}

record Fullinformation(int id, String name, Address adr){

}


@Configuration
public class prog03Config {
    
    @Bean(name = "EmployeeName")
    public String name() {
        return "Ansuman Padhy";
    }

    @Bean(name = "EmployeeID")
    public int id() {
        return 2900;
    }

    @Bean(name = "EmployeeAddress")
    public Address empaddress(String st, String ct) {
        return new Address("Odisha","Berhampur");
    }

    //Function with @Qualifier
    //For test the Qualifier annotation, Please add Qualifier blovk in 72 line and pass it
    /* @Bean(name = "EmployeeAddress1")
    @Qualifier("EmployeeAddressQ")
    public Address empaddress1(String st, String ct) {
        return new Address("Telengana","Hyderabad");
    } */

    //Function with @primary 
    /* @Bean(name = "EmployeeAddress1")
    @Primary
    public Address empaddress1(String st, String ct) {
        return new Address("Telengana","Hyderabad");
    }  */

    // Create a class object type method, 
    // In return Statement we are calling the constructor of the Employee class.
    // Arguments need to pass while you are calling the method  
    @Bean
    public Employee empInfo(int idref, String nameref) {
        return new Employee(idref, nameref);
    }

    //Passing the bean as an argument.
    @Bean(name = "Indetails")
    public Fullinformation inDetail(int EmployeeID, String EmployeeName, Address EmployeeAddress) {
         return new Fullinformation(EmployeeID, EmployeeName, EmployeeAddress);
    }

    //passing the bean with Qualifier concept
    @Bean(name = "IndetailsQuali")
    public Fullinformation inDetailqualifier(int EmployeeID, String EmployeeName,  Address EmployeeAddress) {
         return new Fullinformation(EmployeeID, EmployeeName, EmployeeAddress);
    }
}
