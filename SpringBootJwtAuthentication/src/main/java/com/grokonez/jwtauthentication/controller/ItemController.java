package com.grokonez.jwtauthentication.controller;


import com.grokonez.jwtauthentication.model.Item;
import com.grokonez.jwtauthentication.service.ItemService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "api/items")
@Api(tags = { "Item Controller" })
public class ItemController {
    @Autowired
    private ItemService itemService;


    @ApiOperation(value="get all categories")
    @GetMapping("/all")
    public List<Item> getAllItems(){
        return this.itemService.getAllItems();
    }


    @ApiOperation(value="get items by category name")
    @GetMapping("/{name}")
    public List<Item> getItemsByCatName(@PathVariable("name") String name){
        return this.itemService.getItemByCatName(name);
    }
}
