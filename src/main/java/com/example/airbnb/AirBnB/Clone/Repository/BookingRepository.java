package com.example.airbnb.AirBnB.Clone.Repository;

import com.example.airbnb.AirBnB.Clone.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
}
