package com.practice.classandobject;

public class Person {
    String personName;
    int personAge;
    public Person(String personName,int personAge){
        this.personAge=personAge;
        this.personName=personName;
    }
    public void printPersonAttribute(){
        System.out.println("Person Name is: "+personName+"Person Age is: "+personAge);
    }

    public static void main(String[] args) {
        Person person1=new Person("Mukesh",26);
        Person person2=new Person("Jhon",40);
        person1.printPersonAttribute();
        person2.printPersonAttribute();

    }
}

