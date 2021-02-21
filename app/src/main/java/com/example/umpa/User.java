package com.example.umpa;

public class User {
    private String name;
    private String email;
    private int id;
    private String password;


    public User(String name, String email, String password) {
        this.name = name;
        this.email=email;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
