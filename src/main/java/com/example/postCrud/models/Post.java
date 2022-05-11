package com.example.postCrud.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Post {
    @Id
    private int id;
    private int userId;
    private String img;
    private String description;
    private LocalDate createdOn;

    public Post() {
    }

    public Post(int id, int userId, String img, String description, LocalDate createdOn) {
        this.id = id;
        this.userId = userId;
        this.img = img;
        this.description = description;
        this.createdOn = createdOn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, img, description, createdOn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && userId == post.userId && Objects.equals(img, post.img) && Objects.equals(description, post.description) && Objects.equals(createdOn, post.createdOn);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", img='" + img + '\'' +
                ", description='" + description + '\'' +
                ", createdOn=" + createdOn +
                '}';
    }
}