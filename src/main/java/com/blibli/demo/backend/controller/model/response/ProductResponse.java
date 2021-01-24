package com.blibli.demo.backend.controller.model.response;

import lombok.Builder;
import lombok.Data;

/**
 * @author juan.tjandra
 */
@Data
@Builder
public class ProductResponse {
  private String name;
  private int id;
}
