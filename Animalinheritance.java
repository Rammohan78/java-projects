package xyz;
class Animal {
 String name;

 public Animal(String name) {
     this.name = name;
 }

 public void makeSound() {
     System.out.println("Some generic animal sound");
 }

 public void displayInfo() {
     System.out.println("This is an animal named " + name);
 }
}


class Dog extends Animal {
 public Dog(String name) {
     super(name);
 }

 public void makeSound() {
     System.out.println(name + " says:bhow bhow !");
 }
}

class Cat extends Animal {
 public Cat(String name) {
     super(name);
 }


 public void makeSound() {
     System.out.println(name + " says: Meow meow!");
 }
}

public class Animalinheritance {
 public static void main(String[] args) {
     Animal dog = new Dog("Buddy");
     Animal cat = new Cat("Whiskers");

     dog.displayInfo();
     dog.makeSound();

     cat.displayInfo();
     cat.makeSound();
 }
}
