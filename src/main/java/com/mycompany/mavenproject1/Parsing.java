/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;


import java.io.Serializable;

/**
 *
 * @author MacPro2015
 */
public class Parsing implements Serializable{
    
    
    private String Name;
    private String Country;
    private String City;

    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getCountry()
    {
        return Country;
    }

    public void setCountry(String Country)
    {
        this.Country = Country;
    }

    public String getCity()
    {
        return City;
    }

    public void setCity(String City)
    {
        this.City = City;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("Name = " + getName() + "\n");
        sb.append("City = " + getCity() + "\n");
        sb.append("Country = " + getCountry() + "\n");
        return sb.toString();
    }
}

    

