package com.example.backend_for_frontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.backend_for_frontend.domain.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
    
    // Add custom queries here
}
