package com.example.clone_avito.entity;


import lombok.*;

@Data
@AllArgsConstructor
public class Product {
    private Long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}
