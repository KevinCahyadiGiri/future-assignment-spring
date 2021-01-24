package com.blibli.demo.backend.controller.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author juan.tjandra
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InsertProductRequest {
  private String name;
}
