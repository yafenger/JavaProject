package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "category")
public class Order {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    @Column(name = "order_date")
    private Date orderDate;

    @Enumerated(EnumType.ORDINAL)
    @Column(name="status")
    private OrderStatus status;

    @Size( max = 200)
    @Column(name="remarks")
    private String remarks;

    @ManyToOne
    @JoinColumn(name="USERID")
    private User employee;

    @OneToMany(cascade = CascadeType.ALL, mappedBy ="order")
    private List<OrderDetail> orderDetails;

    public Order() {
    }

    public Order(Date orderDate, OrderStatus status, @Size(max = 200) String remarks, User employee, List<OrderDetail> orderDetails) {
        this.orderDate = orderDate;
        this.status = status;
        this.remarks = remarks;
        this.employee = employee;
        this.orderDetails = orderDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }

    public List<OrderDetail> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
