package com.example.TwinleavesAssignment.service;

import com.example.TwinleavesAssignment.model.Gtin;
import com.example.TwinleavesAssignment.repository.BatchRepository;
import com.example.TwinleavesAssignment.repository.GtinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GtinService {
    @Autowired
    private GtinRepository gtinRepository;
    @Autowired
    private BatchRepository batchRepository;

    public Gtin createGtin(Gtin gtin) {
        return gtinRepository.save(gtin);
    }

    public Gtin getGtinByCode(String gtinCode) {
        return gtinRepository.findByGtin(gtinCode);
    }

    public List<Gtin> searchGtinsByCodes(List<String> gtinCodes) {
        return gtinRepository.findByGtinIn(gtinCodes);
    }

    public List<Gtin> getGtinsWithPositiveBatches() {
        List<String> gtinCodes = batchRepository.findGtinCodesWithPositiveBatches();
        return gtinRepository.findByGtinIn(gtinCodes);
    }
}