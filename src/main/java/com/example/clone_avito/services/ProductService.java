package com.example.clone_avito.services;


import com.example.clone_avito.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();
    private long ID = 0;

    {
        productList.add(new Product(++ID, "Playstation 5", "Special for Pavel", 60000, "Moscow", "Pavel Vinnikov"));
        productList.add(new Product(++ID, "iPhone 13", "iPhone Special for Pavel", 65000, "Moscow", "Nikita Rudenkov"));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        productList.add(product);
    }

    public void deleteProduct(Long id) {
        productList.removeIf(product -> product.getId().equals(id));

    }

    public Product getProductById(Long id) {
        for(Product product:productList){
            if(product.getId().equals(id))return product;
        }
        return null;
    }
}
