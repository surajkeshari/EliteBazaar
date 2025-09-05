package com.keshari2code.ecommerce.entity;

import lombok.Getter;
import lombok.Setter;


import jakarta.persistence.*; // Spring Boot 3.x and above
//import javax.persistence.*;  // Spring Boot 2.x and below
import java.util.Set;

@Entity
@Table(name="product_category")
// @Data -- known bug
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
    private Set<Product> products;

}