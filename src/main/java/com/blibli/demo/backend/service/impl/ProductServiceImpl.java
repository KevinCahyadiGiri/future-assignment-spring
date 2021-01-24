package com.blibli.demo.backend.service.impl;

import com.blibli.demo.backend.controller.model.request.InsertProductRequest;
import com.blibli.demo.backend.entity.Product;
import com.blibli.demo.backend.service.ProductService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author juan.tjandra
 */

@Service
public class ProductServiceImpl implements ProductService {

  @Value("properties.a")
  private String name;

  private int id = 0;

  @Override
  public Product getProduct() {
    return Product
        .builder()
        .name("buku")
        .price(50000)
        .build();
  }

  @Override
  public Product insertProduct(InsertProductRequest productRequest) {
    return Product
        .builder()
        .name(productRequest.getName())
        .id(id++)
        .build();
  }
}
