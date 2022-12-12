package org.example;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("===Klient===");

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
        System.out.println("Pensja managera po awansie: " + manager1.getPensja());
    }
}