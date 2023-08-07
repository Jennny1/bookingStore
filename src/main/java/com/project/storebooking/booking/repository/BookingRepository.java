package com.project.storebooking.booking.repository;

import com.project.storebooking.booking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

    List<Booking> findByUserId(String userId);

    Booking findByUserIdAndbookingId(String userId, Long bookingId);
}

