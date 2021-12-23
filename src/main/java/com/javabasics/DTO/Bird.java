package com.javabasics.DTO;

import com.javabasics.Bean.Animal;

public class Bird implements AnimalImpl {
    @Override
    public void eat(String food) {
        System.out.print("eat food:" + food);
    }

    @Override
    public String drink() {
        System.out.print("drink");
        return "drink";
    }

    @Override
    public Animal run() {
        System.out.print("run");
        Animal info = new Animal();
        info.setName("bird");
        info.setType("bird class");
        return info;
    }
}
