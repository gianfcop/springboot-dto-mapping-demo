/*
 * Spring Boot API Starter Kit
 * Copyright (c) 2025 Gianfranco Coppola. All rights reserved.
 * Commercial use permitted. Redistribution prohibited.
 */
package com.starterkit.api.mapper;

import com.starterkit.api.dto.request.ProductRequest;
import com.starterkit.api.dto.response.ProductResponse;
import com.starterkit.api.entity.Product;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "category.name", target = "category")
    ProductResponse toResponse(Product product);

    List<ProductResponse> toResponseList(List<Product> products);

    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(target = "id", ignore = true)
    Product toEntity(ProductRequest request);
}
