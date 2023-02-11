package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        Manager manager1 = Manager.builder()
                .name("Jarek")
                .surname("Nowak")
                .email("jarek@gmail.com")
                .phone("888777666")
                .salary(8000.0)
                .build();

        Shop shop1 = new Grocery(
                "Żabka",
                "Sopot",
                manager1,
                Set.of(),
                List.of()
        );
        manager1.hire(new Employee("Andrzej", "Kowalski", "Kasjer", "andrzej@gmail.com", 4000.0, manager1));
        manager1.hire(new Employee("Asia", "Kowalska", "Kasjer", "asia@gmail.com", 4000.0, manager1));

        shop1.addProducts(List.of(
                new Product("bułka", 0.6),
                new Product("jabłko", 0.9),
                Product.builder()
                .name("banan")
                .price(1.1)
                .build()
        ));

        Client client1 = new Client("Asia", "Kowalska", "Polska", "00111", 1500);

        Warehouse warehouse1 = new Warehouse();

        //tworzenie kolekcji typu Object i wrzucamy do niej każdy obiekt który tam utworzyliśmy i za pomocą strumienia lub pętli wypisujemy
        List<Object> listofObject = new ArrayList<>(List.of(manager1, client1, shop1));
        //wypisywanie za pomocą strumienia
        listofObject.forEach(System.out::println);


/*        shop1.getProducts().stream()
                .filter(product -> product.getPrice() < 1)
                .forEach(product -> {
                    product.setPrice(product.getPrice() + 10);
                            System.out.println(product.getPrice());
                }
                );
*/
    }
}

//posprzątać
//dodać metody do istniejących klas np. kupownie produktów przez klientów,