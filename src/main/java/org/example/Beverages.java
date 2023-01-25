package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@Setter
@AllArgsConstructor

public class Beverages {
    private String name;

    private double price;

    List<Product> products;


}
