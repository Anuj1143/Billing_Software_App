package com.billing.service;

import com.billing.io.CategoryRequest;
import com.billing.io.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CategoryService {

  CategoryResponse add(CategoryRequest request, MultipartFile file);
  List<CategoryResponse> read();
  void delete (String categoryId);
}
