package com.blibli.demo.backend.entity;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class OrderItem {
    private int harga;
    private int jumlah;
    private String nama;
    private int id;
}
