package com.example.TwinleavesAssignment.service;

import com.example.TwinleavesAssignment.model.Batch;
import com.example.TwinleavesAssignment.repository.BatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchService {
    @Autowired
    private BatchRepository batchRepository;

    public Batch createBatch(Batch batch) {
        return batchRepository.save(batch);
    }

    public List<Batch> getLatestNegativeOrZeroBatch() {
        return batchRepository.findLatestNegativeOrZeroBatches();
    }

}