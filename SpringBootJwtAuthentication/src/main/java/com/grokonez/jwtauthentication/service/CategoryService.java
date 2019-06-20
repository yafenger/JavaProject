package com.grokonez.jwtauthentication.service;

import com.grokonez.jwtauthentication.model.Category;
import com.grokonez.jwtauthentication.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getAllCategories(){
        return this.categoryRepository.findAll();
    }

}