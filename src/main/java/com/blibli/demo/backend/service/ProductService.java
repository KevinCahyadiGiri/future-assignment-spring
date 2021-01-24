package com.blibli.demo.backend.service;

import com.blibli.demo.backend.controller.model.request.InsertProductRequest;
import com.blibli.demo.backend.entity.Product;

/**
 * @author juan.tjandra
 */
public interface ProductService {
  public Product getProduct();
  public Product insertProduct(InsertProductRequest productRequest);
}
