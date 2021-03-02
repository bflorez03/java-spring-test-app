package com.tempe.test.model;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT")
public class Product {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;
}
