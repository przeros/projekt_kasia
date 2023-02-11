package org.example;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Manager
{
    private String name;

    private String surname;

    private String email;

    private String phone;

    private double salary;

    private Shop shop;

    void hire(Employee newEmployee) {
        shop.workers.add(newEmployee);
    }

}
