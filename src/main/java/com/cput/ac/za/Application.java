package com.cput.ac.za;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Application
{
    public static void main(String[] args)
    {
        String [] firstName = {"Linton", "Gareth", "Dimitri", "Ryan", "Jonathan"};
        String [] lastName = {"Appollis", "Abrahams", "Johannes", "Kolbe", "Theron"};
        int [] age = {50, 40, 45, 20, 30};

        Person p = new Person();

        for(int i=0; i<firstName.length; i++)
        {
            p.addFirstName(firstName[i]);
            p.addLastName(lastName[i]);
            p.addAge(age[i]);
            p.list.add(new Person(firstName[i], lastName[i], age[i]));
        }

        //Using Set Data Structure
        Set set = new HashSet();
        set.add(p.list.add(new Person("Dimitri", "Ferus", 60)));    //Append to current list

        //Print list before sorting
        System.out.println("Before sorting!!!\n-----------------");
        System.out.println(p.list.toString());

        //Sort list
        Collections.sort(p.list);
        System.out.println("");

        //Print list after sorting
        System.out.println("After sorting by First name!!!\n------------------------------");
        System.out.println(p.list.toString());

        //Using Map Data Structure
        Map map = new HashMap();
        for(int i=0; i<p.list.size(); i++)
        {
            map.put("key"+i, p.list.get(i));
        }

        //Print out using Map Data Structure
        System.out.println("");
        System.out.println("Print out Map Data Structure!!!\n--------------------------------");
        for(int i=0; i<p.list.size(); i++) {
            System.out.println(map.get("key" + i));
        }
   }
}
