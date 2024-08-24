package com.example.TwinleavesAssignment.controller;

import com.example.TwinleavesAssignment.model.Gtin;
import com.example.TwinleavesAssignment.service.GtinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gtins")
public class GtinController {
    @Autowired
    private GtinService gtinService;

    @PostMapping
    public ResponseEntity<Gtin> createGtin(@RequestBody Gtin gtin) {
        return ResponseEntity.ok(gtinService.createGtin(gtin));
    }

    @GetMapping("/{gtin}")
    public ResponseEntity<Gtin> getGtinByCode(@PathVariable String gtin) {
        return ResponseEntity.ok(gtinService.getGtinByCode(gtin));
    }

    @GetMapping("/search")
    public ResponseEntity<List<Gtin>> searchGtins(@RequestParam List<String> gtins) {
        return ResponseEntity.ok(gtinService.searchGtinsByCodes(gtins));
    }

    @GetMapping("/positive-batches")
    public ResponseEntity<List<Gtin>> getPositiveBatches() {
        return ResponseEntity.ok(gtinService.getGtinsWithPositiveBatches());
    }
}