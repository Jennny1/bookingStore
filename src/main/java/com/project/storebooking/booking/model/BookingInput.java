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
public class BookingInput {

    // 예약ID
    private long bookingId;

    // 매장ID
    private long storeId;

    // 유저ID
    private String userId;

    // 예약시간
    private String bookingDate;

    // 사용여부
    private boolean usingYN;

}
