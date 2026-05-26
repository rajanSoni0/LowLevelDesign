package DesignPatterns.Creational.FactoryPattern.good;

/*
 * Email notification implementation.
 */
public class EmailNotification implements Notification {

    @Override
    public void send() {

        System.out.println(
                "Sending Email Notification"
        );
    }
}
