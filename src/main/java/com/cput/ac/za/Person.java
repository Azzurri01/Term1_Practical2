package com.cput.ac.za;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Person implements Comparable<Person>
{
    public ArrayList<Person> list = new ArrayList<>();
    private String fName, lName;
    private int age;

    public Person ()
    {

    }

    public Person (String fnm, String snm, int ag)
    {
        this.fName=fnm;
        this.lName=snm;
        this.age=ag;
    }

    public String addFirstName(String fName)
    {
        return fName;
    }

    public String addLastName(String lName)
    {
        return lName;
    }

    public int addAge(int age)
    {
        return age;
    }

    public String toString()
    {
        return "Name: " + fName + " " + lName + ", Age: " + age;
    }

    public int compareTo(Person nm)
    {
        return (this.fName).compareTo(nm.fName);
    }
}
