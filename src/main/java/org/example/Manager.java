package org.example;

public class Manager
{
    private String name;

    private String surname;

    private String email;

    private String telefon;

    private double pensja;

    public Manager(String newName, String newSurname, String newEmail, String newTelefon, double newPensja)
    {
        name = newName;
        surname = newSurname;
        email = newEmail;
        telefon = newTelefon;
        pensja = newPensja;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }


    public String getEmail()
    {
        return email;
    }
    public String getTelefon() { return telefon; }

    public double getPensja()
    {
        return pensja;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setSurname(String newSurname)
    {
        surname = newSurname;
    }


    public void setEmail(String newEmail)
    {
        email = newEmail;
    }
    public  void setTelefon(String newTelefin) { telefon = newTelefin; }

    public void setPensja(double newPensja)
    {
        pensja = newPensja;
    }
}
