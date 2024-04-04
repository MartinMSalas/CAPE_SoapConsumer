package com.example.consumingwebservice.logic;


import com.example.consumingwebservice.wsdl.Country;

public class ExtendedCountry extends Country {

    @Override
    public String toString() {
        return "Country{" +
                "name='" + getName() + '\'' +
                ", population=" + getPopulation() +
                ", capital='" + getCapital() + '\'' +
                ", currency=" + getCurrency() +
                '}';
    }
}
