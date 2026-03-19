package com.billing.service;

import com.billing.io.CategoryRequest;
import com.billing.io.CategoryResponse;

import java.util.List;

public interface CategoryService {

  CategoryResponse add(CategoryRequest request);
  List<CategoryResponse> read();
  void delete (String categoryId);
}
