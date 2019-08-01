package com.example.coursebookingservice.components;

import com.example.coursebookingservice.models.Booking;
import com.example.coursebookingservice.models.Course;
import com.example.coursebookingservice.models.Customer;
import com.example.coursebookingservice.repositories.bookingRepositories.BookingRepository;
import com.example.coursebookingservice.repositories.courseRepositories.CourseRepository;
import com.example.coursebookingservice.repositories.customerRepositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class DataLoader implements ApplicationRunner {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;


    public DataLoader() {
    }


    @Override
    public void run(ApplicationArguments args){

        Course course1 = new Course("Intro To Python", "Paisley", 5);
        courseRepository.save(course1);
        Customer customer1 = new Customer("Peter Sullivan", "Paisley", 34);
        customerRepository.save(customer1);
        Booking booking1 = new Booking("10-10-2019", course1, customer1);
        bookingRepository.save(booking1);
        Course course2 = new Course("Advanced Python", "Glasgow", 5);
        courseRepository.save(course2);
        Customer customer2 = new Customer("Adam Houten", "Falkirk", 27);
        customerRepository.save(customer2);
        Booking booking2 = new Booking("10-10-2019", course2, customer2);
        bookingRepository.save(booking2);

        List<Customer> found = customerRepository.findByBookingsCourseId(1L);

    }
}
