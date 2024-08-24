package com.example.TwinleavesAssignment.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Batch {
    @Id
    private String batchId;
    
    private Integer mrp;
    private Integer sp;
    private Integer purchasePrice;
    private Integer availableQuantity;
    private Date inwardedOn;
    private String gtin;
}