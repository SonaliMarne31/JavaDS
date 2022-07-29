package Implement;
// abstract class

public abstract class Person {
    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // abstract method
    public abstract void work();

    public void changeName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public String getCity() {
        return this.city;
    }

}