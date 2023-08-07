package com.project.storebooking.partner.repository;

import com.project.storebooking.partner.entity.Partner;
import com.project.storebooking.store.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.servlet.http.Part;

@Repository
public interface PartnerRepository extends JpaRepository<Partner, String> {
}
