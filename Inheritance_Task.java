package asus;
public class Inheritance_Task {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.bark();
        dog.speak();
        dog.eat();
        dog.legs();
        dog.sleep();
        cat.sound();
        cat.eat();
        cat.legs();
        cat.sleep();
        cat.name();
    }
}

class Animal{
    public void legs(){
        System.out.println("Animal has 4legs ");
    }
    void eat(){
        System.out.println("Animals eat Grass");
    }

    void sleep(){
        System.out.println("Animals may sleep");
    }
}

class Dog extends Animal{
    public void speak(){
        System.out.println("dog sounds : Bow Bow!");
    }
    void bark(){
        System.out.println("Dog barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("cat : Meow! Meow!");
    }
    void name(){
        System.out.println("Cat name is rocky!");
    }
}