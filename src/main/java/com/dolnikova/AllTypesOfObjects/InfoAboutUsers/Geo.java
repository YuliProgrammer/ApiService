package com.dolnikova.AllTypesOfObjects.InfoAboutUsers;

public class Geo {

    String lat;
    String lng;

    public Geo() {
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "Geo{" +
                "lat = '" + lat + '\'' +
                ", lng = '" + lng + '\'' +
                '}';
    }

}
