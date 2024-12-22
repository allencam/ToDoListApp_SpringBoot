package com.allencam.ToDoListApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String hashed_password;

    private String role;

    public User() {}

    public User(String role, String hashed_password, String username, int user_id) {
        this.role = role;
        this.hashed_password = hashed_password;
        this.username = username;
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getHashed_password() {
        return hashed_password;
    }

    public void setHashed_password(String hashed_password) {
        this.hashed_password = hashed_password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
               "user_id=" + user_id +
               ", username='" + username + '\'' +
               ", hashed_password='" + hashed_password + '\'' +
               ", role='" + role + '\'' +
               '}';
    }
}
