package org.example;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Client client1 = new Client("Andrzej", "Nowak", "Polska", "500984123", 20);
        System.out.println("imie klienta: " + client1.getName());
        client1.setName("Kasia");
        System.out.println("imie klienta po zmianie: " + client1.getName());
    }
}