package com.javabasics.Service;

import com.javabasics.DTO.Bird;
import com.javabasics.DTO.Dog;

public class AnimalRaceCtl {

    private void fly(){
        Bird bird = new Bird();
        bird.eat("eat corn\n");
    }

    private void walk(){
        Dog dog = new Dog();
        System.out.print(dog.drink());
    }


    public static void main(String[] arg){
        AnimalRaceCtl mAnimalRaceCtl = new AnimalRaceCtl();
        mAnimalRaceCtl.fly();

        mAnimalRaceCtl.walk();
        StringBuilder strBul = new StringBuilder("124");





    }
}
