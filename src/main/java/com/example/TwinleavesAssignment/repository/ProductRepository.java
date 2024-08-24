package com.example.TwinleavesAssignment.repository;

import com.example.TwinleavesAssignment.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}