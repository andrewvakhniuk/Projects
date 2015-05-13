package com.vah.services;

import com.vah.dao.CategoryDAOInterface;
import com.vah.dao.ProductDAOInterface;
import com.vah.entities.Category;
import com.vah.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryService implements CategoryServiceInterface{

    @Autowired
    CategoryDAOInterface categoryDAO;

    public Category addCategory(Category category){
        categoryDAO.addCategory(category);
        return category;
    }
}
