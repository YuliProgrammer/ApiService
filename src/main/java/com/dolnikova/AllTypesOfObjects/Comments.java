package com.dolnikova.AllTypesOfObjects;

public class Comments {

    int postId;
    int id;
    String name;
    String email;
    String body;

    public Comments() {
    }

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "Comments{" +
                "postId = " + postId +
                ", id = " + id +
                ", name = '" + name + '\'' +
                ", email = '" + email + '\'' +
                ", body = '" + body + '\'' +
                '}';
    }
}
