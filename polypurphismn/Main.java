package polypurphismn;

import java.util.Scanner;


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal; // Reference variable of type Animal

        myAnimal = new Dog(); // Dog object
        myAnimal.sound(); // Calls Dog's sound method

        myAnimal = new Cat(); // Cat object
        myAnimal.sound(); // Calls Cat's sound method
    }
}