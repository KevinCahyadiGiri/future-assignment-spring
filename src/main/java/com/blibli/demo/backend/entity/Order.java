package com.blibli.demo.backend.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Order {
    private List<OrderItem> orderItems;
    private int totalHarga;
    private Customer pelanggan;
    private int id;
}
