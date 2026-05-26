package DesignPatterns.Creational.BuilderPattern.good;

public class Main {

    public static void main(String[] args) {

        /*
         * Step-by-step object creation.
         */
        User user = new UserBuilder()

                .setId(1)

                .setName("Rajan")

                .setEmail("rajan@gmail.com")

                .setAge(22)

                .setAddress("Delhi")

                .setPhone("9999999999")

                .build();

        user.display();
    }
}
