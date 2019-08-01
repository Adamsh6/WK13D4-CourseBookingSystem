package com.example.coursebookingservice.controllers;

import com.example.coursebookingservice.models.Booking;
import com.example.coursebookingservice.repositories.bookingRepositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")

public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingByDate(@PathVariable String date){
        return bookingRepository.findByDate(date);
    }
}
