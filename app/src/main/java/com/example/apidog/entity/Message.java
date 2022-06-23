package com.example.apidog.entity;

public class Message {
    private int id;
    private String name;
   private String life_span;
   private String temperament;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLife_span() {
        return life_span;
    }

    public String getTemperament() {
        return temperament;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", life_span='" + life_span + '\'' +
                ", temperament='" + temperament + '\'' +
                '}';
    }
}
