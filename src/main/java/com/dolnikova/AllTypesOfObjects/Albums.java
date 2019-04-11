package com.dolnikova.AllTypesOfObjects;

public class Albums {

    int userId;
    int id;
    String title;

    public Albums() {
    }

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Albums{" +
                "userId = " + userId +
                ", id = " + id +
                ", title = '" + title + '\'' +
                '}';
    }
}
