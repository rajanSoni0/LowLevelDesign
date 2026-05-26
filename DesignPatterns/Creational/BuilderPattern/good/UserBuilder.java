package DesignPatterns.Creational.BuilderPattern.good;

/*
 * Builder class responsible
 * for step-by-step object creation.
 */
public class UserBuilder {

    int id;
    String name;
    String email;
    int age;
    String address;
    String phone;

    public UserBuilder setId(int id) {

        this.id = id;

        return this;
    }

    public UserBuilder setName(String name) {

        this.name = name;

        return this;
    }

    public UserBuilder setEmail(String email) {

        this.email = email;

        return this;
    }

    public UserBuilder setAge(int age) {

        this.age = age;

        return this;
    }

    public UserBuilder setAddress(String address) {

        this.address = address;

        return this;
    }

    public UserBuilder setPhone(String phone) {

        this.phone = phone;

        return this;
    }

    /*
     * Final object creation.
     */
    public User build() {

        return new User(this);
    }
}
