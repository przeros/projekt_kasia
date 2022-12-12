package org.example;

import java.security.PublicKey;
import java.util.*;

public class Shop
{
    String name;

    String type;

    String location;

    Manager manager;

    Set<Pracownik> workers;

    List<Product> products;

    //Konstruktor
    public Shop( String newName, String newType, String newLocation, Manager newManager, Set<Pracownik> newWorkers, List<Product> newProducts)
    {
        name = newName;
        type = newType;
        location = newLocation;
        manager = newManager;
        workers = new HashSet<>(newWorkers);
        products = new ArrayList<>(newProducts);
    }

    public String getName() { return name; }

    public String getType() { return type; }

    public String getLocation() { return location; }

    public Manager getManager() { return manager; }

    public Set<Pracownik> getWorkers() { return workers; }

    public List<Product> getProducts() { return products; }

    public void setName(String newName) { name = newName; }

    public void setType(String newType) {type = newType; }

    public void setLocation(String newLocation) { location = newLocation; }

    public void setManager(Manager newManager) { manager = newManager; }

    public void setWorkers(Set<Pracownik> newWorkers) { workers = newWorkers; }

    public void addWorker(Pracownik worker)
    {
        workers.add(worker);
    }

    public void deleteWorker(Pracownik worker)
    {
        workers.remove(worker);
    }

    public void setProducts(List<Product> newProducts) { products = newProducts; }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    public void deleteProduct(Product product)
    {
        products.remove(product);
    }



}
