package SolidPrinciples.SRP.bad;

public class Main {

    public static void main(String[] args) {

        UserService userService = new UserService();

        userService.registerUser("Rajan");
        userService.saveToDatabase();
        userService.sendEmail();
    }
}