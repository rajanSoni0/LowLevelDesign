package DesignPatterns.Creational.FactoryPattern.bad;

/*
 * Concrete notification class.
 */
public class EmailNotification {

    public void send() {

        System.out.println(
                "Sending Email Notification"
        );
    }
}