package com.grokonez.jwtauthentication.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Column(name="QUANTITY")
    private int quantity;

    @ManyToOne
    @JoinColumn(name="ORDERID")
    private Order order;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name="ITEMID", referencedColumnName = "ID")
    private Item item;

    public OrderDetail() {
    }

    public OrderDetail(int quantity, Order order, Item item) {
        this.quantity = quantity;
        this.order = order;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
