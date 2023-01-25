package org.example;

import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@Setter
public class Grocery extends Shop {
    public Grocery(String name, String location, Manager manager, Set<Employee> workers, List<Product> products) {
        super(name, location, manager, workers, products);
    }
}
