package com.dolnikova.AllTypesOfObjects;

public class Posts {

    int userId;
    int id;
    String title;
    String body;

    public Posts() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Posts{ " +
                "userId = " + userId +
                ", id = " + id +
                ", title = '" + title + '\'' +
                ", body = '" + body + '\'' +
                '}';
    }
}
