package edu.icet.spring01_20.model;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private String name;
    private String vendor;
    private Double price;
}
