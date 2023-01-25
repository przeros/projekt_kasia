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
public class Supplier {

    private String name;

    private String surname;

    private Shop destinationShop;

    private Manager manager;

    private List<Product> products;


}
