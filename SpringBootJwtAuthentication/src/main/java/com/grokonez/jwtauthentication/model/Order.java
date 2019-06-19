package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Enumerated(EnumType.ORDINAL)
    private OrderStatus status;

    @Size( max = 200)
    private String remarks;

    @ManyToOne
    @JoinColumn(name="USERID",nullable =false)
    private User employee;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="order")
    private List<OrderDetail> orderDetails;

}
