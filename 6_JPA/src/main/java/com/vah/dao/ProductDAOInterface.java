package com.vah.dao;

import com.vah.entities.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDAOInterface {
    Product addProduct(Product product);

    Product getProduct(int id);

    void saveProduct(Product lecture);

}
