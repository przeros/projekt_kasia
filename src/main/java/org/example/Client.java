package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@AllArgsConstructor
public class Client
{
    private String name;

    private String surname;

    private String nationality;

    private String phone;

    private double money;



}
