package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.security.PublicKey;
import java.util.*;


@Getter
@ToString
@Setter
@AllArgsConstructor

public class Shop
{
    String name;

    String type;

    String location;

    Manager manager;

    Set<Pracownik> workers;

    List<Product> products;


}
