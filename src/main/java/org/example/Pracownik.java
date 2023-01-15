package org.example;

import lombok.ToString;

import java.sql.SQLOutput;

@ToString

public class Pracownik
    {
        private String name;

        private String surname;

        private String stanowisko;//po angielsku pisać!

        private String email;

        private double pensja;

        private Manager manager;

        public Pracownik(String newName, String newSurname, String newStanowisko, String newEmail, double newPensja, Manager newManager)
        {
            name = newName;
            surname = newSurname;
            stanowisko = newStanowisko;
            email = newEmail;
            pensja = newPensja;
            manager = newManager;
        }

        public String getName()
        {
            return name;
        }

        public String getSurname()
        {
            return surname;
        }

        public String getStanowisko()
        {
            return stanowisko;
        }

        public String getEmail()
        {
            return email;
        }

        public double getPensja()
        {
            return pensja;
        }


        public Manager getManager() {
            return manager;
        }

        public void setManager(Manager manager) {
            this.manager = manager;
        }

        public void setName(String newName)
        {
            name = newName;
        }

        public void setSurname(String newSurname)
        {
            surname = newSurname;
        }

        public void setStanowisko(String newStanowisko)
        {
            stanowisko = newStanowisko;
        }

        public void setEmail(String newEmail)
        {
            email = newEmail;
        }

        public void setPensja(double newPensja)
        {
            pensja = newPensja;
        }

        public void promote(String newStanowisko, double increasePercentage)
        {
            stanowisko = newStanowisko;
            pensja = pensja + (pensja*increasePercentage);
            System.out.println("Awans pracownika na stanowisko: " + newStanowisko);
        }

    }
