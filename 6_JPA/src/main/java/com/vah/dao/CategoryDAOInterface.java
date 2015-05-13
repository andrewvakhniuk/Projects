package com.vah.dao;

import com.vah.entities.Category;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDAOInterface {
    public Category addCategory(Category category);
}
