package com.practice.classandobject;

import org.w3c.dom.ls.LSOutput;

public class Dog {
    private String dogName;
    private String dodBreed;
    public Dog(String dogName,String dodBreed){
        this.dogName=dogName;
        this.dodBreed=dodBreed;
    }
    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDodBreed() {
        return dodBreed;
    }

    public void setDodBreed(String dodBreed) {
        this.dodBreed = dodBreed;
    }

    public static void main(String[] args) {
        Dog dog1=new Dog("WhiteDog","Pug");
        Dog dog2=new Dog("RedDog","BullDog");
        System.out.println("Update the dog name of WhiteDog");
        dog1.setDogName("WhiteDogSuper");
        System.out.println("First Dog Name is: "+ dog1.getDogName()+" And the dog breed is: "+dog1.getDodBreed());
        System.out.println("Second Dog Name is: "+ dog2.getDogName()+" And the dog breed is: "+dog2.getDodBreed());

    }
}
