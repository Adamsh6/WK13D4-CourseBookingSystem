package com.example.coursebookingservice.repositories.customerRepositories;

import com.example.coursebookingservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseId(Long id);
    List<Customer> findByTownIgnoreCaseAndBookingsCourseId(String town, Long id);
    List<Customer> findByAgeGreaterThanAndTownIgnoreCaseAndBookingsCourseId(int age, String town, Long id);
}
