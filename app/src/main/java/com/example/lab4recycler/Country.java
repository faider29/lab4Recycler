package com.example.lab4recycler;


/**
 * Created by Maxim Andrienko
 * 5/21/19
 */
public class Country {

    private String country;

    private String city;

    private String id;



    public Country(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return country + city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
