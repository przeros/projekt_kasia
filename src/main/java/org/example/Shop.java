package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@ToString
@Builder
public abstract class Shop
{
    protected String name;

    protected String location;

    protected Manager manager;

    protected Set<Employee> workers;

    protected List<Product> products;

    void addProduct(Product newProduct) {
        products.add(newProduct);
    }

    void addProducts(List<Product> newProducts) {
        products.addAll(newProducts);
    }

}
