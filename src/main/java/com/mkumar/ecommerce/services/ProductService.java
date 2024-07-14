package com.mkumar.ecommerce.services;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.mkumar.ecommerce.entites.Product;
import com.mkumar.ecommerce.payloads.ProductDTO;
import com.mkumar.ecommerce.payloads.ProductResponse;

public interface ProductService {

	ProductDTO addProduct(Long categoryId, Product product);

	ProductResponse getAllProducts(Integer pageNumber, Integer pageSize, String sortBy, String sortOrder);

	ProductResponse searchByCategory(Long categoryId, Integer pageNumber, Integer pageSize, String sortBy,
			String sortOrder);

	ProductDTO updateProduct(Long productId, Product product);

	ProductDTO updateProductImage(Long productId, MultipartFile image) throws IOException;

	ProductResponse searchProductByKeyword(String keyword, Integer pageNumber, Integer pageSize, String sortBy,
			String sortOrder);

	String deleteProduct(Long productId);

}
