package com.grokonez.jwtauthentication.service;


import com.grokonez.jwtauthentication.model.Item;
import com.grokonez.jwtauthentication.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems(){
        return this.itemRepository.findAll();
    }

    public List<Item>  getItemByCatName(String name){
        return this.itemRepository.findItemByCategoryName(name);
    }
}
