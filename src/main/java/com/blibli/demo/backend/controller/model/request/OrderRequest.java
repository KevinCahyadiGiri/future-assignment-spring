package com.blibli.demo.backend.controller.model.request;

import com.blibli.demo.backend.entity.Customer;
import com.blibli.demo.backend.entity.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Customer pelanggan;
    private List<OrderItemRequest> orderItems;
}
