package com.project.storebooking.partner.model;

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

/*
파트너 정보
 */
public class PartnerInput {

    // 파트너 아이디
    private String partnerId;

    // 비밀번호
    private String password;

    // 이메일
    private String email;



}
