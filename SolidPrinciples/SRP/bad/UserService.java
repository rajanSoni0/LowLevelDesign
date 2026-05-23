package SolidPrinciples.SRP.bad;

public class UserService {

    public void registerUser(String name) {
        System.out.println("User registered: " + name);
    }

    public void saveToDatabase() {
        System.out.println("Saving to database");
    }

    public void sendEmail() {
        System.out.println("Sending email");
    }
}