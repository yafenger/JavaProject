package com.grokonez.jwtauthentication.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "category", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "name"
        })
})
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Size( max = 15)
    private String name;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "category")
   // @JoinColumn(name = "CATID")
    private List<Item> items;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
