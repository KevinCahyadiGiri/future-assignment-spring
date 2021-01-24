package com.blibli.demo.backend.controller;

import com.blibli.demo.backend.controller.model.request.InsertProductRequest;
import com.blibli.demo.backend.controller.model.request.OrderRequest;
import com.blibli.demo.backend.controller.model.response.ProductResponse;
import com.blibli.demo.backend.entity.Order;
import com.blibli.demo.backend.entity.Product;
import com.blibli.demo.backend.service.impl.CashierServiceImpl;
import com.blibli.demo.backend.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juan.tjandra
 */
@RestController
public class ProductController {

  @Autowired
  private CashierServiceImpl cashierService;

  @GetMapping(value="/orders")
  public int returnTotalOrder() {
    return cashierService.getTotalOrder();
  }

  @GetMapping(value="/orders/{id}")
  public Order getOrderWithId(@PathVariable int id) {
    return cashierService.getOrderWithId(id);
  }

  @PostMapping(value="/orders")
  public String putNewOrder(@RequestBody OrderRequest order) {
    cashierService.putOrder(order);
    return "sucess";
  }


//  @Value("naming.a")
//  String a;

//  @Autowired
//  private ProductServiceImpl productService;

//  @GetMapping(value = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
//  public ProductResponse getProduct () {
//    Product product = productService.getProduct();
//    return ProductResponse
//        .builder()
//        .name(product.getName())
//        .build();
//  }
//  @GetMapping(value = "/product/{productId}", produces = MediaType.APPLICATION_PDF_VALUE)
//  public Product getProductById (
//      @PathVariable String productid
//  ) {
//    return productService.getProduct();
//  }
//
//  @PostMapping(value = "/product")
//  public ProductResponse submitProduct (
//      @RequestBody InsertProductRequest productRequest) {
//    Product product = productService.insertProduct(productRequest);
//    return ProductResponse
//        .builder()
//        .name(product.getName())
//        .id(product.getId())
//        .build();
//  }
}
