package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vet veterinar = new Vet();
        Scanner in = new Scanner(System.in);
        /// китикет по имени Лиза
        System.out.println("Как зовут кiтёнка: ");
        String name = in.nextLine();
        System.out.println("Что в последний раз кушал кiтёнок: ");
        String food = in.nextLine();
        System.out.println("Где в последний раз был кiтёнок: ");
        String location = in.nextLine();
        System.out.println("К какому виду относится кiтёнок: ");
        String kind = in.nextLine();
        Cat cat = new Cat(name,food,location,kind);
        veterinar.treatAnimal(cat);
        System.out.println(" ");
        /// собачка 
        System.out.println("Как зовут собачку: ");
        name = in.nextLine();
        System.out.println("Что в последний раз кушала собачка: ");
        food = in.nextLine();
        System.out.println("Где в последний раз была собачка: ");
        location = in.nextLine();
        System.out.println("К какому виду относится собачка: ");
        kind = in.nextLine();
        Dog dog = new Dog(name, food, location, kind);
        veterinar.treatAnimal(dog);
        System.out.println(" ");
        /// Кролик
        System.out.println("Как зовут кролика: ");
        name = in.nextLine();
        System.out.println("Что в последний раз кушал кролик: ");
        food = in.nextLine();
        System.out.println("Где в последний раз был кролик: ");
        location = in.nextLine();
        System.out.println("К какому виду относится кролик: ");
        kind = in.nextLine();
        Rabbit rabbit = new Rabbit(name,food,location,kind);
        veterinar.treatAnimal(rabbit);
    }
}
class Animal {
    String name;
    String food;
    String location;
    String kind;
    public Animal(String name, String food, String location, String kind) {
        this.name = name;
        this.food = food;
        this.location = location;
        this.kind = kind;
    }
}
class Cat extends Animal {
    public Cat(String name, String food, String location, String kind) {
        super(name, food, location, kind);
    }
}
class Dog extends Animal {
    public Dog(String name, String food, String location, String kind) {
        super(name, food, location, kind);
    }
}
class Rabbit extends Animal {
    public Rabbit(String name, String food, String location, String kind) {
        super(name, food, location, kind);
    }
}
class Vet{
    public void treatAnimal(Animal animal){
        System.out.println("\n!Приём у врача:");
        System.out.println("на приёме у врача сейчас " + animal.kind);
        System.out.println("питомец: " + animal.name + "" +
                "\nкушает: " + animal.food + "" +
                "\nпоследний раз был найден: " + animal.location);
        System.out.print("--------------");
    }
}
