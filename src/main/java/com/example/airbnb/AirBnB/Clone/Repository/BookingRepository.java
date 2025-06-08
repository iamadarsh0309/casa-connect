package com.example.airbnb.AirBnB.Clone.Repository;

import com.example.airbnb.AirBnB.Clone.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
List<Booking> findByPropertyId(Long propertyId);
}
