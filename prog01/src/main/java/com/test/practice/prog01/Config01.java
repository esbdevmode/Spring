package com.test.practice.prog01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Person
String name, int age */
record Person(String name, int age) {
 
}

/**
 * Address
String city, String street */

record Address(String city, String street) {
}

record Information(Address adr, Person per){

}

@Configuration
public class Config01 {

    //Simple Bean Methods
    @Bean
    public String name() {
        return "Ansuman";
    }
    
    //Simple Bean Methods
    @Bean
    public int age() {
        return 30;
    }

    //record type Bean methods
    @Bean(name = "perdetails")
    public Person person() {
        return new Person("Andrew", 30);
    }

    //record type class Bean methods
    @Bean(name = "addetails")
    public Address address() {
        return new Address("Berhampur","Jayadurga Nagar");
    }

    // Methods with Bean name type
    @Bean(name = "setFlags")
    public boolean flag() {
        return  true;
    }


}
