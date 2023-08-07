package com.project.storebooking.booking.controller;

import com.project.storebooking.booking.entity.Booking;
import com.project.storebooking.booking.model.BookingInput;
import com.project.storebooking.booking.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookingController {
    private final BookingRepository bookingRepository;

    /*
    상점 예약
     */
    @PostMapping("/booking/create")
    public String createBooking(@RequestBody BookingInput bookingInput) {
        String resultMessage = bookingInput.getBookingDate() + " 타임 예약이 완료되었습니다.";

        System.out.println();
        Booking booking = Booking
                .builder()
                .storeId(bookingInput.getStoreId())
                .userId(bookingInput.getUserId())
                .bookingDate(bookingInput.getBookingDate())
                .regDate(LocalDateTime.now())
                .build();


        bookingRepository.save(booking);

        return resultMessage;
    }

    /*
    예약확인
     */
    @GetMapping("/booking/check")
    public String createBooking(@PathVariable String userId, @PathVariable String bookingDate, @PathVariable Long bookingId) {
        List<Booking> bookedList;
        LocalDateTime bookDate = null;

        // bookingDate 처리
        if (!bookingDate.contains("-")) {
            bookingDate = bookingDate.substring(0, 3) + "-" + bookingDate.substring(4, 5) + "-" + bookingDate.substring(6, 9);
            bookDate = LocalDateTime.parse(bookingDate, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        } else {
            bookDate = LocalDateTime.parse(bookingDate);
        }

        // user Id로 예약정보 조회
        if (!userId.equals("")) {
            bookedList = bookingRepository.findByUserId(userId);

        } else {
            // 정보가 없을때 처리
            return "유저아이디를 입력해주세요";
        }

        // 조회 결과가 없을 때
        if (bookedList.isEmpty()) {
            return "예약정보가 없습니다.";

        } else {
            // 조회 결과가 있을 때

            if (bookDate.equals(LocalDateTime.now()) || LocalDateTime.now().isBefore(bookDate)) {
                System.out.println(userId + "님 " + bookDate.toString() + " 예약 확인 완료");
                return userId + "님 " + bookDate.toString() + " 예약 확인 완료";

                // 예약사용
                Booking booking = bookingRepository.findByUserIdAndbookingId(userId, bookingId);
                booking.setUsingYN(true);
                bookingRepository.save(booking);
                System.out.println("예약 사용 완료");

            } else {
                return userId + "님 " + bookDate.toString() + " 예약 시간지 지났습니다.";

            }
        }
    }

    /*
    예약사용
     */
    public void UsingBooking(String userId){
        Booking booking = (Booking) bookingRepository.findByUserId(userId);
        booking.setUsingYN(true);
        bookingRepository.save(booking);
        System.out.println("예약 사용 완료");
    }

}
