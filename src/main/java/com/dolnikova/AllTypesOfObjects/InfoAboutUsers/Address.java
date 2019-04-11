package com.dolnikova.AllTypesOfObjects.InfoAboutUsers;

import java.util.ArrayList;
import java.util.List;

public class Address {

    String street;
    String suite;
    String city;
    String zipcode;
    Geo geo;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public String getSuite() {
        return suite;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public Geo getGeo() {
        return geo;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street = '" + street + '\'' +
                ", suite = '" + suite + '\'' +
                ", city = '" + city + '\'' +
                ", zipcode = '" + zipcode + '\'' +
                ", geo = " + geo +
                '}';
    }

}
