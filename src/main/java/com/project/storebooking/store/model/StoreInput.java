package com.project.storebooking.store.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Component
public class StoreInput {

    // pw
    private String password;

    // 매장 위치
    private String location;

    // 매장 이름
    private String storeName;

    // 매장 설명
    private String storeDescription;

    // 등록일자
    private LocalDateTime regDate;


}
