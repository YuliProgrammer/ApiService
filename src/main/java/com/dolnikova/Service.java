package com.dolnikova;

import com.dolnikova.AllTypesOfObjects.*;

import java.util.List;

public interface Service {

    List<Users> getUsersList();
    Users getUserById(int id);

    List<Posts> getPostsList();
    Posts getPostById(int id);
    List<Posts> getPostByUserId(int userId);
    void createPost(Posts newPost);
    void updatePost(int id, Posts newPost);
    void deletePost(int id);

    List<Comments> getCommentsList();
    Comments getCommentById(int id);
    List<Comments> getCommentByPostId(int postId);

    List<Albums> getAlbumsList();
    Albums getAlbumById(int id);

    List<Photos> getPhotosList();
    Photos getPhotoById(int id);

    List<Todos> getTodosList();
    Todos getTodoById(int id);
}
