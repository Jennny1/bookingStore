package com.project.storebooking.partner.controller;

import com.project.storebooking.partner.entity.Partner;
import com.project.storebooking.partner.model.PartnerInput;
import com.project.storebooking.partner.repository.PartnerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
/*
파트너 관련 Controller
 */
public class partnerController {
    private final PartnerRepository partnerRepository;

    /*
    파트너 등록
     */
    @PostMapping("/partner/create")
    public void createPartner(@RequestBody PartnerInput partnerInput){
        Partner partner = Partner.builder()
                .partnerId(partnerInput.getPartnerId())
                .password(partnerInput.getPassword())
                .email(partnerInput.getEmail())
                .regDate(LocalDateTime.now())
                .build();

        partnerRepository.save(partner);

    }
}
