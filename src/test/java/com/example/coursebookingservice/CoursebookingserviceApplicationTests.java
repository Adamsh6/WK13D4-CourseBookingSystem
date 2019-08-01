package com.example.coursebookingservice;

import com.example.coursebookingservice.models.Booking;
import com.example.coursebookingservice.models.Course;
import com.example.coursebookingservice.models.Customer;
import com.example.coursebookingservice.models.Enums.StarRating;
import com.example.coursebookingservice.repositories.bookingRepositories.BookingRepository;
import com.example.coursebookingservice.repositories.courseRepositories.CourseRepository;
import com.example.coursebookingservice.repositories.customerRepositories.CustomerRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoursebookingserviceApplicationTests {

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canCreateCourse() {
		Course course = new Course("Intro To Python", "Paisley", StarRating.TWO);
		courseRepository.save(course);
	}

	@Test
	public void canCreateCustomer() {
		Customer customer = new Customer("Peter Sullivan", "Paisley", 34);
		customerRepository.save(customer);
	}

	@Test
	public void canCreateBookingAndCourseAndCustomer() {
		Course course = new Course("Intro To Python", "Paisley", StarRating.FIVE);
		courseRepository.save(course);
		Customer customer = new Customer("Peter Sullivan", "Paisley", 34);
		customerRepository.save(customer);
		Booking booking = new Booking("10/10/2019", course, customer);
		bookingRepository.save(booking);
	}

}
