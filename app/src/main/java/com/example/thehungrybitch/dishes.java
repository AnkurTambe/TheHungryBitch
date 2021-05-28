package com.example.thehungrybitch;

public class dishes {
    String name;
    String description;
    int price;

    dishes(String name, String description, int price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\n\t--" + description + "\n\t\t-- Rs." + price;
    }
}
