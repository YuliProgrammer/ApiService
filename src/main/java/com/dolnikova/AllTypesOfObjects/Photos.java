package com.dolnikova.AllTypesOfObjects;

public class Photos {
    int albumId;
    int id;
    String title;
    String url;
    String thumbnailUrl;

    public Photos() {
    }

    public int getAlbumId() {
        return albumId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    @Override
    public String toString() {
        return "Photos{" +
                "albumId = " + albumId +
                ", id = " + id +
                ", title = '" + title + '\'' +
                ", url = '" + url + '\'' +
                ", thumbnailUrl = '" + thumbnailUrl + '\'' +
                '}';
    }
}
