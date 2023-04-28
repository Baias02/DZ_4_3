package com.example.dz_4_3.animal;
import java.io.Serializable;

public class Animal implements Serializable {
    String name;
    int sum;
    String color;
    int image;

    public Animal(String name, int sum, String color, int image) {
        this.name = name;
        this.sum = sum;
        this.color = color;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
