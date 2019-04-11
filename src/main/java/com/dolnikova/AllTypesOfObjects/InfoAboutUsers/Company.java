package com.dolnikova.AllTypesOfObjects.InfoAboutUsers;

public class Company {

    String name;
    String catchPhrase;
    String bs;

    public Company() {
    }

    public String getName() {
        return name;
    }

    public String getCatchPhrase() {
        return catchPhrase;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name = '" + name + '\'' +
                ", catchPhrase = '" + catchPhrase + '\'' +
                ", bs = '" + bs + '\'' +
                '}';
    }

}
