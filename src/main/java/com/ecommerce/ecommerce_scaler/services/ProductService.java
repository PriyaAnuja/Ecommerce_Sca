package com.ecommerce.ecommerce_scaler.services;

import com.ecommerce.ecommerce_scaler.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long id);

    List<Product> getAllProducts();
}
