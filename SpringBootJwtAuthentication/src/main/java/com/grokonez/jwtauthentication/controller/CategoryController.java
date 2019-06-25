package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Category;
import com.grokonez.jwtauthentication.model.Item;
import com.grokonez.jwtauthentication.service.CategoryService;
import com.grokonez.jwtauthentication.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "api/category")
@Api(tags = { "Category Controller" })
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @Autowired
    private ItemService itemService;


    @ApiOperation(value="get all categories")
    @GetMapping("/all")
    public List<Category> getAllCategories(){
        return this.categoryService.getAllCategories();
    }

    @ApiOperation(value="get items by category ID")
    @GetMapping("/{id}")
    public List<Item> getItemsByCatName(@PathVariable("id") Integer id){
        return this.itemService.getItemByCatID(id);
    }


}
