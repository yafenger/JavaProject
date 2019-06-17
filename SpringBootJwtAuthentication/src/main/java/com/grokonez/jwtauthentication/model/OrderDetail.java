package com.grokonez.jwtauthentication.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    private int quantity;

    @ManyToOne
    @JoinColumn(name="ORDERID")
    private Order order;

    @OneToOne
    @JoinColumn(name="ITEMID")
    private Item item;
}
