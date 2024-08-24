package com.example.TwinleavesAssignment.controller;

import com.example.TwinleavesAssignment.model.Batch;
import com.example.TwinleavesAssignment.service.BatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/batches")
public class BatchController {
    @Autowired
    private BatchService batchService;

    @PostMapping
    public ResponseEntity<Batch> createBatch(@RequestBody Batch batch) {
        return ResponseEntity.ok(batchService.createBatch(batch));
    }

    @GetMapping("/latest-negative-or-zero-batch")
    public ResponseEntity<List<Batch>> getLatestNegativeOrZeroBatch() {
        return ResponseEntity.ok(batchService.getLatestNegativeOrZeroBatch());
    }
}