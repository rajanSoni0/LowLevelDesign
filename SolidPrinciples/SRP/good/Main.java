package SolidPrinciples.SRP.good;

/*
 * Main class to test SRP implementation.
 */
public class Main {

    public static void main(String[] args) {

        // Object responsible for user operations
        UserService userService = new UserService();

        // Object responsible for database operations
        DatabaseService databaseService = new DatabaseService();

        // Object responsible for email operations
        EmailService emailService = new EmailService();

        // Register user
        userService.registerUser("Rajan");

        // Save user data
        databaseService.saveToDatabase();

        // Send confirmation email
        emailService.sendEmail();
    }
}