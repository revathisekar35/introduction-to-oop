package com.techreturners.exercises003;

import com.techreturners.exercises002.Bird;

public class Pigeon extends Bird {
	
    public Pigeon(String name, String color) {
        super(name, color);
    }

    public void eatPizza() {
        System.out.println("Delicious pizza!");
    }
    public void sleep() {
        System.out.println("I'm a sleeping pigeon");
    }
    @Override
    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " pigeon.");
    }
}
