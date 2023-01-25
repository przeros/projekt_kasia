package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Getter
@ToString
@Setter
@AllArgsConstructor

public class Warehouse {

    String location;

    Manager manager;

    Set<Employee> workers;

    List<Product> products;


}