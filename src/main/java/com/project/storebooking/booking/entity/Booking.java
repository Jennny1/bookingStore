package com.project.storebooking.booking.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

/*
예약 관련 Entity
 */
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 예약ID
    private long bookingId;

    // 매장ID
    private long storeId;

    // 유저ID
    private String userId;

    // 예약시간
    private String bookingDate;

    // 등록시간
    private LocalDateTime regDate;

    // 사용여부
    private boolean usingYN;

}
