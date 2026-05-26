package DesignPatterns.Creational.BuilderPattern.good;

/*
 * Product class.
 */
public class User {

    private int id;
    private String name;
    private String email;
    private int age;
    private String address;
    private String phone;

    /*
     * Constructor accepts builder object.
     */
    public User(UserBuilder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
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
