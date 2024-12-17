package com.ecommerce.ecommerce_scaler.controllers;

import com.ecommerce.ecommerce_scaler.models.Product;
import com.ecommerce.ecommerce_scaler.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    ProductService productService;
    public ProductController(ProductService productService){// dependency injection
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
        return productService.getSingleProduct(id);
    }

    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
}
