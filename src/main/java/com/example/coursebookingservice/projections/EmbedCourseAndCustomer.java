package com.example.coursebookingservice.projections;

import com.example.coursebookingservice.models.Booking;
import com.example.coursebookingservice.models.Course;
import com.example.coursebookingservice.models.Customer;
import org.springframework.data.rest.core.config.Projection;

@Projection(name="embedCourseAndCustomer",types = Booking.class)

public interface EmbedCourseAndCustomer {

    String getDate();
    Course getCourse();
    Customer getCustomer();
}
