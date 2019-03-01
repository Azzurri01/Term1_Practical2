package com.cput.ac.za;

public class PersonInterfaceImplementation implements PersonInterface
{
    @Override
    public String addFirstName(String fName)
    {
        return fName;
    }

    @Override
    public String addLastName(String lName)
    {
        return lName;
    }

    @Override
    public int addAge(int age)
    {
        return age;
    }
}
