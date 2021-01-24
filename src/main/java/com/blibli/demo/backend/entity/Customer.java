package com.blibli.demo.backend.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Customer {
    private String name;
    private String email;
}
