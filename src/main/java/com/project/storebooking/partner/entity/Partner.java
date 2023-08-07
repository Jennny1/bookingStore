package com.project.storebooking.partner.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

/*
파트너(Partner) 관련 entity
 */
public class Partner {

    // 파트너 아이디
    @Id
    private String partnerId;

    // 비밀번호
    private String password;

    // 이메일
    private String email;

    // 등록일
    private LocalDateTime regDate;

}

