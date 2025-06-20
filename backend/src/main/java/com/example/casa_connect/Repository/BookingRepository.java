package com.example.casa_connect.Repository;

import com.example.casa_connect.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
List<Booking> findByPropertyId(Long propertyId);
}
