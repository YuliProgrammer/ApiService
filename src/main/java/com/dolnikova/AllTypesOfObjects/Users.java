package com.dolnikova.AllTypesOfObjects;

import com.dolnikova.AllTypesOfObjects.InfoAboutUsers.Address;
import com.dolnikova.AllTypesOfObjects.InfoAboutUsers.Company;

import java.util.ArrayList;
import java.util.List;

public class Users {

    int id;
    String name;
    String username;
    String email;
    Address address;
    String phone;
    String website;
    List<Company> companies;

    public Users() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Address getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }

    public List<Company> getCompanies() {
        return companies;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", username = '" + username + '\'' +
                ", email = '" + email + '\'' +
                ", address = " + address +
                ", phone = '" + phone + '\'' +
                ", website = '" + website + '\'' +
                ", companies = " + companies +
                '}';
    }

}
