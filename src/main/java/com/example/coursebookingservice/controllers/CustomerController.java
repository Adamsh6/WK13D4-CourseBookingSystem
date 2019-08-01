package com.example.coursebookingservice.controllers;


import com.example.coursebookingservice.models.Customer;
import com.example.coursebookingservice.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/customers")

public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value ="/course/{id}")
    public List<Customer> getCustomersByCourse(@PathVariable Long id){
        return customerRepository.findByBookingsCourseId(id);
    }

    @GetMapping(value ="/town/{town}/course/{id}")
    public List<Customer> getCustomerByTownAndCourse(@PathVariable String town, @PathVariable Long id){
        return customerRepository.findByTownIgnoreCaseAndBookingsCourseId(town, id);
    }

    @GetMapping(value = "/age_over/{age}/town/{town}/course/{id}")
    public List<Customer> getCustomerByAgeGreaterThanAndTownAndCourse(@PathVariable int age, @PathVariable String town, @PathVariable Long id){
        return customerRepository.findByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(age, town, id);
    }

}
