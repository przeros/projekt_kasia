package org.example;

public class Client
{
    private String name;

    private String surname;

    private String nationality;

    private String phone;

    private double money;

    public Client(String newName, String newSurname, String newNationality, String newPhone, double newMoney)
    {
        name = newName;
        surname = newSurname;
        nationality = newNationality;
        phone = newPhone;
        money = newMoney;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public String getNationality()
    {
        return nationality;
    }

    public String getPhone()
    {
        return phone;
    }

    public double getMoney()
    {
        return money;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setSurname(String newSurname)
    {
        surname = newSurname;
    }

    public void setNationality(String newNationality)
    {
        nationality = newNationality;
    }

    public void setPhone(String newPhone)
    {
        phone = newPhone;
    }

    public void setMoney(double newMoney)
    {
        money = newMoney;
    }
}
