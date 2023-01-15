package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Manager manager1 = new Manager("Jarek", "Nowak", "jarek@gmail.com", "888777666", 8000.0);
        Pracownik pracownik1 = new Pracownik("Andrzej", "Kowalski", "Kasjer", "andrzej@gmail.com", 4000.0, manager1);
        Pracownik pracownik2 = new Pracownik("Asia", "Kowalska", "Kasjer", "asia@gmail.com", 4000.0, manager1);
        Client client1 = new Client("Asia", "Kowalska", "Polska", "00111", 1500);
        Product product1 = new Product("bułka", 0.6);
        Product product2 = new Product("jabłko", 0.9);
        Product product3 = new Product("banan", 1.1);
        Shop shop1 = new Shop(
                "Żabka",
                "Spożywczy",
                "Sopot", manager1,
                Set.of(pracownik1, pracownik2),
                List.of(product1, product2, product3)
        );

        //System.out.println(shop1.getManager().getName() + " " + shop1.getManager().getSurname());
        //System.out.println(manager1);//wyświetla się numer referencji,
        //System.out.println(manager1);//metoda dziedziczona z klasy Object
        //System.out.println(pracownik1);
        //System.out.println(product1);

        //tworzenie kolekcji typu Object i wrzucamy do niej każdy obiekt który tam utworzyliśmy i za pomocą strumienia lub pętli wypisujemy
        List<Object> listofObject = new ArrayList<>(List.of(manager1, pracownik1, pracownik2, client1, product1, product2, product3, shop1));
        //wypisywanie za pomocą strumienia
        listofObject.forEach(System.out::println);

        System.out.println(client1.getMoney());

/*        shop1.getProducts().stream()
                .filter(product -> product.getPrice() < 1)
                .forEach(product -> {
                    product.setPrice(product.getPrice() + 10);
                            System.out.println(product.getPrice());
                }
                );
*/

     /*   System.out.println("===Klient===");

        Client client1 = new Client("Andrzej", "Nowak", "Polska", "500984123", 20);
        System.out.println("imie klienta: " + client1.getName());
        client1.setName("Kasia");
        System.out.println("imie klienta po zmianie: " + client1.getName());

        System.out.println("===Pracownik===");

        Pracownik pracownik1 = new Pracownik("Krzysztof", "Kowalski", "Sprzedawca", "k.kowalski@wp.pl", 3500);
        System.out.println("imie pracownika: " + pracownik1.getName());
        pracownik1.setName("Michał");
        System.out.println("imie pracownika po zmianie: " + pracownik1.getName());

        System.out.println("########################");

        System.out.println("imie i nazwisko pracownika: " + pracownik1.getName() + " " + pracownik1.getSurname());
        pracownik1.setStanowisko("Starszy sprzedawca");
        System.out.println("Stanowisko pracownika: " + pracownik1.getStanowisko());
        pracownik1.setEmail("michal.kowalski@wp.pl");
        System.out.println("Email pracownika: " + pracownik1.getEmail());
        System.out.println("Pensja pracownika przed awansem: " + pracownik1.getPensja());
        pracownik1.promote("Starszy sprzedawca", 0.10);
        System.out.println("Pensja pracownika po awansie: " + pracownik1.getPensja());

        System.out.println("===Manager===");

        Manager manager1 = new Manager("Jakub", "Jakubowski", "Manager", "Sprzedawca", "j.jakubowski@wp.pl", "111 222 333", 3500);
        System.out.println("imie i nazwisko managera: " + manager1.getName() + " " + manager1.getSurname());
        manager1.setName("Kazimierz" + " " + "Kazimierczak");
        System.out.println("imie managera po zmianie: " + manager1.getName() );

        System.out.println("########################");

        manager1.setStanowisko("Starszy manager");
        System.out.println("Stanowisko: " + manager1.getStanowisko());
        manager1.setPodwladny("Manager");
        System.out.println("Podwladny: " + manager1.getPodwladny());
        manager1.setEmail("kazimierz.kaziierczak@wp.pl");
        System.out.println("Email starszego managera: " + manager1.getEmail());
        manager1.setStanowisko("444 555 666");
        System.out.println("Nowy numer telefonu managera: " + manager1.getTelefon());
        System.out.println("Pensja managera: " + manager1.getPensja());
        manager1.promote("Starszy manager", 0.15);
        System.out.println("Pensja managera po awansie: " + manager1.getPensja());*/
    }
}

//posprzątać
//na angielski zmienić
//dodać metod do istneijących klas np. kupownie produktów przez klientów,
// napianie nowej klasy, np. konkretne klasy produktów