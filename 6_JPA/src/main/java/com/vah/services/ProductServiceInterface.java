package com.vah.services;

import com.vah.entities.Product;

public interface ProductServiceInterface {
    public Product addProduct(Product product);
    public Product getProduct(int id);
}
