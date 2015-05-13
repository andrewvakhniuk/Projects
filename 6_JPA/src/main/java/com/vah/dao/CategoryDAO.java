package com.vah.dao;

import com.vah.entities.Category;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
@Transactional
public class CategoryDAO implements CategoryDAOInterface{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Category addCategory(Category category) {
        em.persist(category);
        return category;
    }
}
