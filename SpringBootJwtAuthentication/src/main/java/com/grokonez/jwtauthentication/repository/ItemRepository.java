package com.grokonez.jwtauthentication.repository;


import com.grokonez.jwtauthentication.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findAll();

    @Query("SELECT i FROM Item i WHERE i.category.id=:catID")
    List<Item> findItemByCategoryID(@Param("catID") Integer catID);
}
