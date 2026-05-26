package DesignPatterns.Creational.FactoryPattern.good;

/*
 * SMS notification implementation.
 */
public class SMSNotification implements Notification {

    @Override
    public void send() {

        System.out.println(
                "Sending SMS Notification"
        );
    }
}
