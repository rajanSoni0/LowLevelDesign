package SolidPrinciples.SRP.good;

/*
 * Responsibility:
 * Handles database-related operations only.
 * 
 * Reason to change:
 * If database logic or storage mechanism changes.
 */
public class DatabaseService {

    // Simulates saving data into database
    public void saveToDatabase() {
        System.out.println("Saving data to database");
    }
}