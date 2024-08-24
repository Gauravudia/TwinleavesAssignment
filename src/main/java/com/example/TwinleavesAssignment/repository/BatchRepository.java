package com.example.TwinleavesAssignment.repository;

import com.example.TwinleavesAssignment.model.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BatchRepository extends JpaRepository<Batch, Long> {
    @Query("SELECT DISTINCT b.gtin FROM Batch b WHERE b.availableQuantity > 0")
    List<String> findGtinCodesWithPositiveBatches();

    @Query("Select b from Batch b where b.availableQuantity <=0 and b.inwardedOn = " +
            "(SELECT MAX(b2.inwardedOn) FROM Batch b2 WHERE b2.availableQuantity <= 0 and b2.gtin = b.gtin)")
    List<Batch> findLatestNegativeOrZeroBatches();
}