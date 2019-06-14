package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank
    private String itemName;

    @NotBlank
    private String unit;

    @NotBlank
    private int stock;

    @NotBlank
    private double unitPrice;

    @Column(name = "CATID")
    private int catId;

    public Item() {
    }

    public Item(@NotBlank String itemName, @NotBlank String unit, @NotBlank int stock, @NotBlank double unitPrice, int catId) {
        this.itemName = itemName;
        this.unit = unit;
        this.stock = stock;
        this.unitPrice = unitPrice;
        this.catId = catId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }
}
