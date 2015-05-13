package com.vah.services;

import com.vah.dao.ProductDAO;
import com.vah.dao.ProductDAOInterface;
import com.vah.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public class ProductService implements ProductServiceInterface{
    @Autowired
    ProductDAOInterface productDAO;

    public Product addProduct(Product product){
        product = productDAO.addProduct(product);
        System.out.println(product);
        return product;
    }

    public Product getProduct(int id) {
        return productDAO.getProduct(id);
    }

}
