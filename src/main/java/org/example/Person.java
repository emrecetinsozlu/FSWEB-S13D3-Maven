package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;
    private Double salary;
    public Person(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    public Person(String firstName, String lastName, int age, String email, String address, Double salary) {
        this(firstName, lastName, age);
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public Integer getAge() {
        return age;
    }
    public boolean isTeen(){
        return this.age >= 13 && this.age <= 19;

    }

}
