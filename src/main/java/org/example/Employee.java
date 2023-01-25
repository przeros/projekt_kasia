package org.example;

import lombok.ToString;

import java.sql.SQLOutput;

@ToString

public class Employee
    {
        private String name;

        private String surname;

        private String position;

        private String email;

        private double salary;

        private Manager manager;

        public Employee(String newName, String newSurname, String newPosition, String newEmail, double newSalary, Manager newManager)
        {
            name = newName;
            surname = newSurname;
            position = newPosition;
            email = newEmail;
            salary = newSalary;
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

        public String getPosition()
        {
            return position;
        }

        public String getEmail()
        {
            return email;
        }

        public double getSalary()
        {
            return salary;
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

        public void setPosition(String newPosition)
        {
            position = newPosition;
        }

        public void setEmail(String newEmail)
        {
            email = newEmail;
        }

        public void setSalary(double newSalary)
        {
            salary = newSalary;
        }

        public void promote(String newPosition, double increasePercentage)
        {
            position = newPosition;
            salary = salary + (salary*increasePercentage);
            System.out.println("Awans pracownika na stanowisko: " + newPosition);
        }

    }
