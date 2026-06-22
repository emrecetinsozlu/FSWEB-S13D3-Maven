package org.example;

public class Main {
    public static void main(String[] args) {

        Person john = new Person("John", "Doe", 20);
        Person emre = new Person("Emre", "Cetinsozlu", 20);
        System.out.println("Firstname: " + john.getFirstName());

        System.out.println("LastName: " + emre.getLastName());

        System.out.println("Age: " + emre.getAge());

        Wall wall = new Wall(5,4);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

    }
}
