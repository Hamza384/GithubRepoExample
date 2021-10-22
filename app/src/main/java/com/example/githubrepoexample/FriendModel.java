package com.example.githubrepoexample;

public class FriendModel {

    int age;
    String name;


    //for firebase as it also needs an empty constructor to work
    public FriendModel() {
    }

    public FriendModel(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
