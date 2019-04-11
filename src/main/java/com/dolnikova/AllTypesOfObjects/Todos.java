package com.dolnikova.AllTypesOfObjects;

public class Todos {

    int userId;
    int id;
    String title;
    boolean completed;

    public Todos() {
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

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Todos{" +
                "userId = " + userId +
                ", id = " + id +
                ", title = '" + title + '\'' +
                ", completed = " + completed +
                '}';
    }
}
