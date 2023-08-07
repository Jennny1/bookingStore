package com.project.storebooking.user.model;

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
유저 정보
 */
public class UserInput {

    // 유저 아이디
    private String userId;

    // 비밀번호
    private String password;

    // 이메일
    private String email;



}
