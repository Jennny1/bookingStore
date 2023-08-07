package com.project.storebooking.booking.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Component
public class BookingCheckInput {

    // 유저ID
    private String userId;

    // 예약시간
    private String bookingDate;


}
