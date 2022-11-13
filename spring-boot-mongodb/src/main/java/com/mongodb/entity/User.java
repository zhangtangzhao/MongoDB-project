package com.mongodb.entity;

public class User {
    
    private String id;
    
    private String name;
    
    public static User builder(){
        return  new User();
    }

    public User id(String id) {
        this.id = id;
        return this;
    }
    public User name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
