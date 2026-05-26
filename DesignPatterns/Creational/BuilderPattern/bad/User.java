package DesignPatterns.Creational.BuilderPattern.bad;

/*
 * BAD DESIGN:
 * Huge constructor with many parameters.
 */
public class User {

    private int id;
    private String name;
    private String email;
    private int age;
    private String address;
    private String phone;

    public User(
            int id,
            String name,
            String email,
            int age,
            String address,
            String phone
    ) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public void display() {

        System.out.println(
                id + " "
                + name + " "
                + email + " "
                + age + " "
                + address + " "
                + phone
        );
    }
}
