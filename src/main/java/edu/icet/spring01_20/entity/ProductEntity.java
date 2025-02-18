package edu.icet.spring01_20.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")

public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //primary key auto generate
    private Long id;
    private String name;
    private String vendor;
    private Double price;
}
