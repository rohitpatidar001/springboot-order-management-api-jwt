package com.example.orderapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private Long userId;
    private Long productId;
    private int quantity;
}
