package com.project.storebooking.store.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Store {

    /*
    매장(store) 관련 entity
    매장 관련 정보는 id, password, 매장 위치, 매장 이름, 매장 설명, 등록일자가 있다.
     */

    @Id
    private String storeId; // 매장 id

    @Column
    private String password; // 비밀번호

    @Column
    private String location; // 매장 위치

    @Column
    private String storeName; // 매장 이름

    @Column
    private String storeDescription; // 매장 설명

    @Column
    private LocalDateTime regDate; // 등록일자


}
