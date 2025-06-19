package com.example.casa_connect.Service;

import com.example.casa_connect.Entity.Booking;
import com.example.casa_connect.Entity.Property;
import com.example.casa_connect.Repository.BookingRepository;
import com.example.casa_connect.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private PropertyRepository propertyRepository;

    /**
     * params propertyId
     * params StartDate , endDate return param Booking Object
     */

    public Booking createBooking(Long propertyId , LocalDate startDate , LocalDate endDate){
        Property property = propertyRepository.findById(propertyId).
                orElseThrow(()-> new RuntimeException("Property not found"));
        Booking booking = new Booking();
        booking.setProperty(property);
        booking.setStartDate(startDate);
        booking.setEndDate(endDate);

        //save the booking

        return bookingRepository.save(booking);
    }



    //get all bookings
    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }
    //get booking by property

    public List<Booking> getBookingByProperty(Long propertyId){
        return bookingRepository.findByPropertyId(propertyId);
    }

    public void deleteBooking ( Long id){
        bookingRepository.deleteById(id);
    }

    public Booking getBookingById(Long id){
        return bookingRepository.findById(id).orElseThrow(()-> new RuntimeException("Booking not found"));
    }
}
