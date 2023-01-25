package org.example;

import lombok.*;

import java.util.List;
import java.util.Set;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Warehouse {

    private String location;

    private Manager manager;

    private Set<Employee> workers;

    private List<Product> products;


}
