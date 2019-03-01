package com.cput.ac.za;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class PersonTest
{
    ApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigClass.class);
    PersonInterface pInterface = (PersonInterface) appContext.getBean("AliasPerson");

    PersonInterface p = new PersonInterfaceImplementation();

    @Test
    public void testAddFirstName()
    {
            String result = p.addFirstName("Dimitri");
            Assert.assertEquals("Dimitri", result);
    }

    @Test
    public void testAddLastName()
    {
        String result = p.addLastName("Johannes");
        Assert.assertEquals("Johannes", result);
    }

    @Test
    public void testAddAge()
    {
            int result = p.addAge(10);
            Assert.assertEquals(10, result);
    }
}