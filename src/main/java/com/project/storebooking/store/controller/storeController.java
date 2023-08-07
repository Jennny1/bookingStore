package com.project.storebooking.store.controller;

import com.project.storebooking.store.entity.Store;
import com.project.storebooking.store.model.StoreInput;
import com.project.storebooking.store.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
/*
상점 관련 Controller
 */
public class storeController {
    private final StoreRepository storeRepository;

    /*
    상점등록
     */
    @PostMapping("/store/create")
    public void createStore(@RequestBody StoreInput storeInput){
        Store store = Store
                .builder()
                .storeName(storeInput.getStoreName())
                .storeDescription(storeInput.getStoreDescription())
                .location(storeInput.getLocation())
                .password(storeInput.getPassword())
                .regDate(LocalDateTime.now())
                .build();
        storeRepository.save(store);
    }


}
