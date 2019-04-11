package com.dolnikova;

import com.dolnikova.AllTypesOfObjects.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApiService service = ApiService.getInstance();

        List<Users> usersList = service.getUsersList();
        for (Users users : usersList) {
            System.out.println(users);
        }

        Users user = service.getUserById(7);
        System.out.println(user);

        List<Posts> postsList = service.getPostsList();
        for (Posts posts : postsList) {
            System.out.println(posts);
            System.out.println();
        }

        Posts post = service.getPostById(43);
        System.out.println(post);

        List<Posts> postsListWithUserId = service.getPostByUserId(3);
        for (Posts posts : postsListWithUserId) {
            System.out.println(posts);
            System.out.println();
        }

        List<Comments> commentsList = service.getCommentsList();
        for (Comments comments : commentsList) {
            System.out.println(comments);
            System.out.println();
        }

        Comments comment = service.getCommentById(455);
        System.out.println(comment);

        List<Comments> commentsListWithPostId = service.getCommentByPostId(99);
        for (Comments comments : commentsListWithPostId) {
            System.out.println(comments);
            System.out.println();
        }

        List<Albums> albumsList = service.getAlbumsList();
        for (Albums albums : albumsList) {
            System.out.println(albums);
            System.out.println();
        }

        Albums album = service.getAlbumById(17);
        System.out.println(album);

        List<Photos> photosList = service.getPhotosList();
        for (Photos photos : photosList) {
            System.out.println(photos);
            System.out.println();
        }

        Photos photos = service.getPhotoById(39);
        System.out.println(photos);

        List<Todos> todosList = service.getTodosList();
        for (Todos todos : todosList) {
            System.out.println(todos);
            System.out.println();
        }

        Todos todos = service.getTodoById(155);
        System.out.println(todos);

        Posts newPosts = new Posts();
        newPosts.setUserId(1);
        newPosts.setTitle("my first new post");
        newPosts.setBody("something useful");
        service.createPost(newPosts);

        Posts postToUpdate = service.getPostById(1);
        post.setTitle("yuli");
        service.updatePost(1, postToUpdate);

        service.deletePost(17);
    }

}
