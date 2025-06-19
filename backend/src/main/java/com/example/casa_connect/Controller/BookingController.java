package com.example.casa_connect.Controller;

import com.example.casa_connect.Entity.Booking;
import com.example.casa_connect.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    //posting a new booking in association to a property id
    @PostMapping
    public Booking createBooking(@RequestParam Long propertyId,
                                 @RequestParam LocalDate startDate,
                                 @RequestParam LocalDate endDate
                                 ) {
        return bookingService.createBooking(propertyId,startDate,endDate);

    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id){
        return bookingService.getBookingById(id);
    }

    @GetMapping
    public List<Booking> getAllBookings(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/property/{propertyId}")
    public List<Booking> getBookingByProperty(@PathVariable Long propertyId){
        return bookingService.getBookingByProperty(propertyId);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Long id){
        bookingService.deleteBooking(id);
    }


}
