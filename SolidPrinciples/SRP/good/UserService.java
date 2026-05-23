package SolidPrinciples.SRP.good;

/*
 * Responsibility:
 * Handles only user-related business operations.
 * 
 * Reason to change:
 * If user registration logic changes.
 */
public class UserService {

    // Handles user registration
    public void registerUser(String name) {
        System.out.println("User registered: " + name);
    }
}