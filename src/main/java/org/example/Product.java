package org.example;

public class Product
{
    private String name;

    private double price;

    public Product(String newName, double newPrice)
    {
        name = newName;
        price = newPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
