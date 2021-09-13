package com.example.Rupesh;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private boolean isOnline;

    public User(String name, boolean isOnline) {
        this.name = name;
        this.isOnline = isOnline;
    }
}
