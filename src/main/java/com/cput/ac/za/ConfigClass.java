package com.cput.ac.za;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass
{
    @Bean(name="AliasPerson")

    public PersonInterface getService()
    {
        return new PersonInterfaceImplementation();
    }
}
