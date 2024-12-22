package com.allencam.ToDoListApp.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile {

    @OneToOne
    @JoinColumn(name = "user_id", nullable = false)
    private int userId;

    private String firstName;

    private String lastName;

    private String image_url;

    public Profile() {}

    public Profile(int user_id, String firstName, String lastName, String image_url) {
        this.userId = user_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.image_url = image_url;
    }

    public int getUser_id() {
        return userId;
    }

    public void setUser_id(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    @Override
    public String toString() {
        return "Profile{" +
               "user_id=" + userId +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
               ", image_url='" + image_url + '\'' +
               '}';
    }
}
