package com.example.backend_for_frontend.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@Entity
@Table(name = "order")
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
    @SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 100)
    private Long id;

}