package com.example.TwinleavesAssignment.repository;

import com.example.TwinleavesAssignment.model.Gtin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GtinRepository extends JpaRepository<Gtin, Long> {
    Gtin findByGtin(String gtin);
    List<Gtin> findByGtinIn(List<String> gtinCodes);
}