/*
 * Spring Boot API Starter Kit
 * Copyright (c) 2025 Gianfranco Coppola. All rights reserved.
 * Commercial use permitted. Redistribution prohibited.
 */
package com.starterkit.api.service;

import com.starterkit.api.dto.request.ProductRequest;
import com.starterkit.api.dto.response.ProductResponse;
import com.starterkit.api.entity.Category;
import com.starterkit.api.entity.Product;
import com.starterkit.api.mapper.ProductMapper;
import com.starterkit.api.repository.CategoryRepository;
import com.starterkit.api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;


    @Transactional
    public ProductResponse createProduct(ProductRequest request) {
        Category category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Category not found with id: " + request.getCategoryId()));

        Product product = productMapper.toEntity(request);
        product.setCategory(category); 

        Product saved = productRepository.save(product);

        return productMapper.toResponse(saved);
    }

    public List<ProductResponse> getAllProducts() {
        return productMapper.toResponseList(productRepository.findAll());
    }

    @Transactional
    public ProductResponse updateProduct(Long id, ProductRequest request) {
        
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with id: " + id));
        
        Category category = categoryRepository.findById(request.getCategoryId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found with id: " + request.getCategoryId()));
        
        existingProduct.setName(request.getName());
        existingProduct.setPrice(request.getPrice());
        existingProduct.setCategory(category);
        
        Product saved = productRepository.save(existingProduct);

        return productMapper.toResponse(saved);
    }

    @Transactional
    public void deleteProduct(Long id) {
                Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Product not found with id: " + id));
        
        productRepository.delete(product);
    }
}
