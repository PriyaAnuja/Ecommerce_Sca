package com.ecommerce.ecommerce_scaler.services;

import com.ecommerce.ecommerce_scaler.dtos.FakeStoreProductDTO;
import com.ecommerce.ecommerce_scaler.models.Category;
import com.ecommerce.ecommerce_scaler.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{

    RestTemplate restTemplate;
    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        FakeStoreProductDTO fakeStoreProductDto =
                restTemplate.getForObject("https://fakestoreapi.com/products/1" + productId ,
                FakeStoreProductDTO.class);

        return convertFakeStoreProductDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    private Product convertFakeStoreProductDtoToProduct(FakeStoreProductDTO fakeStoreProductDto){
        Product product = new Product();
        product.setId(fakeStoreProductDto.getId());
        product.setCategory(new Category(fakeStoreProductDto.getCategory(), fakeStoreProductDto.getDescription()));
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        return product;
    }
}
