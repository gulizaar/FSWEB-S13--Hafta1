package org.example.enums;

public enum Plan {
    BASIC("Basic Plan", 100),
    STANDARD("Standard Plan", 250),
    PREMIUM("Premium Plan", 500);

    private String name;
    private int price;

     Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public String getName(){
         return name;

    }
    public int getPrice(){
         return price;
    }
}
