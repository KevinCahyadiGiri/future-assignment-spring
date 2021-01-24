package com.blibli.demo.backend.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author juan.tjandra
 */
@Data
@Builder
public class Product {
  private int id;
  private String name;
  private double price;
  private String warna;
  private String jumlah;
  private int a;
  private int b;
}
