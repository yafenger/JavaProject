package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Category;
import com.grokonez.jwtauthentication.service.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "api/categories")
@Api(tags = { "Category Controller" })
public class CategoryController {
    @Autowired
    private CategoryService categoryService;


    @ApiOperation(value="get all categories")
    @GetMapping("/all")
    public List<Category> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

}
