package com.javabasics.DTO;

import com.javabasics.Bean.Animal;

public class Dog implements AnimalImpl {
    @Override
    public void eat(String food) {
        System.out.print("dog eat:"+food);
    }

    @Override
    public String drink() {

        return "dog drink pure water";
    }

    @Override
    public Animal run() {
        Animal mAnimal = new Animal();
        mAnimal.setName("dog");
        mAnimal.setType("mammal");
        return mAnimal;
    }
}
