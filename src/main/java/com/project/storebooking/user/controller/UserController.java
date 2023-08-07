package com.project.storebooking.user.controller;

import com.project.storebooking.user.entity.User;
import com.project.storebooking.user.model.UserInput;
import com.project.storebooking.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
/*
유저 관련 Controller
 */
public class UserController {
    private final UserRepository userRepository;

    /*
    유저 등록
     */
    @PostMapping("/user/create")
    public void userCtrete(@RequestBody UserInput userInput){
        User user = User
                .builder()
                .userId(userInput.getUserId())
                .password(userInput.getPassword())
                .email(userInput.getEmail())
                .regDate(LocalDateTime.now())
                .build();

        userRepository.save(user);
    }
}
