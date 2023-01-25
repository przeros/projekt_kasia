package org.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.*;

@AllArgsConstructor
@ToString
public abstract class Shop
{
    private String name;

    private String location;

    private Manager manager;

    private Set<Employee> workers;

    private List<Product> products;


}
