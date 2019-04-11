package com.dolnikova;

import com.dolnikova.AllTypesOfObjects.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class ApiService implements Service {

    public static final String SERVER_URL = "https://jsonplaceholder.typicode.com/";

    private final String USERS = SERVER_URL + "users/";
    private final String POSTS = SERVER_URL + "posts/";
    private final String COMMENTS = SERVER_URL + "comments/";
    private final String ALBUMS = SERVER_URL + "albums/";
    private final String PHOTOS = SERVER_URL + "photos/";
    private final String TODOS = SERVER_URL + "todos/";

    private static ApiService instance;

    private List<Users> usersList;
    private List<Posts> postsList;
    private List<Comments> commentsList;
    private List<Albums> albumsList;
    private List<Photos> photosList;
    private List<Todos> todosList;

    public static synchronized ApiService getInstance() {
        if (instance == null) {
            instance = new ApiService();
        }
        return instance;
    }

    private ApiService() {
    }

    Gson gson = new Gson();

    public List<Users> getUsersList() {
        String json = HttpUtil.sendRequest(USERS, null, null);

        Type listType = new TypeToken<ArrayList<Users>>() {
        }.getType();
        usersList = gson.fromJson(json, listType);

        return usersList;
    }

    public Users getUserById(int id) {
        if (id <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(USERS + id, null, null);
        Users user = gson.fromJson(json, Users.class);
        return user;
    }


    public List<Posts> getPostsList() {
        String json = HttpUtil.sendRequest(POSTS, null, null);

        Type listType = new TypeToken<ArrayList<Posts>>() {
        }.getType();
        postsList = gson.fromJson(json, listType);

        return postsList;
    }

    public Posts getPostById(int id) {
        if (id <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(POSTS + id, null, null);
        Posts post = gson.fromJson(json, Posts.class);
        return post;
    }

    public List<Posts> getPostByUserId(int userId) {
        if (userId <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(POSTS.substring(0, POSTS.length() - 1) + "?userId=" + userId, null, null);
        Type listType = new TypeToken<ArrayList<Posts>>() {
        }.getType();
        postsList = gson.fromJson(json, listType);

        return postsList;
    }

    public void createPost(Posts newPost) {
        getPostsList();
        newPost.setId(postsList.size() + 1);
        String json = gson.toJson(newPost);

        HttpUtil.sendRequest(POSTS, null, json);
    }

    public void updatePost(int id, Posts newPost) {
        String json = gson.toJson(newPost);
        HttpUtil.updateUrl(POSTS + id, null, json);
    }

    public void deletePost(int id) {
        HttpUtil.deleteUrl(POSTS + id, null, null);
    }


    public List<Comments> getCommentsList() {
        String json = HttpUtil.sendRequest(COMMENTS, null, null);

        Type listType = new TypeToken<ArrayList<Comments>>() {
        }.getType();
        commentsList = gson.fromJson(json, listType);
        return commentsList;
    }

    public Comments getCommentById(int id) {
        if (id <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(COMMENTS + id, null, null);
        Comments comments = gson.fromJson(json, Comments.class);
        return comments;
    }

    public List<Comments> getCommentByPostId(int postId) {
        if (postId <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(COMMENTS.substring(0, COMMENTS.length() - 1) + "?postId=" + postId, null, null);
        Type listType = new TypeToken<ArrayList<Comments>>() {
        }.getType();
        commentsList = gson.fromJson(json, listType);
        return commentsList;
    }


    public List<Albums> getAlbumsList() {
        String json = HttpUtil.sendRequest(ALBUMS, null, null);

        Type listType = new TypeToken<ArrayList<Albums>>() {
        }.getType();
        albumsList = gson.fromJson(json, listType);
        return albumsList;
    }

    public Albums getAlbumById(int id) {
        if (id <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(ALBUMS + id, null, null);
        Albums albums = gson.fromJson(json, Albums.class);
        return albums;
    }


    public List<Photos> getPhotosList() {
        String json = HttpUtil.sendRequest(PHOTOS, null, null);

        Type listType = new TypeToken<ArrayList<Photos>>() {
        }.getType();
        photosList = gson.fromJson(json, listType);
        return photosList;
    }

    public Photos getPhotoById(int id) {
        if (id <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(PHOTOS + id, null, null);
        Photos photos = gson.fromJson(json, Photos.class);
        return photos;
    }


    public List<Todos> getTodosList() {
        String json = HttpUtil.sendRequest(TODOS, null, null);

        Type listType = new TypeToken<ArrayList<Todos>>() {
        }.getType();
        todosList = gson.fromJson(json, listType);
        return todosList;
    }

    public Todos getTodoById(int id) {
        if (id <= 0) {
            System.out.println("Erorr. Incorrect id. ");
            return null;
        }

        String json = HttpUtil.sendRequest(TODOS + id, null, null);
        Todos todos = gson.fromJson(json, Todos.class);
        return todos;
    }


    @Override
    public String toString() {
        return "ApiService{" +
                "usersList = " + usersList +
                ", postsList = " + postsList +
                ", commentsList = " + commentsList +
                ", albumsList = " + albumsList +
                ", photosList = " + photosList +
                ", todosList = " + todosList +
                '}';
    }
}
