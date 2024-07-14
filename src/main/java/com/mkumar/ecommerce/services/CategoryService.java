package com.mkumar.ecommerce.services;

import com.mkumar.ecommerce.entites.Category;
import com.mkumar.ecommerce.payloads.CategoryDTO;
import com.mkumar.ecommerce.payloads.CategoryResponse;

public interface CategoryService {

	CategoryDTO createCategory(Category category);

	CategoryResponse getCategories(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

	CategoryDTO updateCategory(Category category, Long categoryId);

	String deleteCategory(Long categoryId);
}
