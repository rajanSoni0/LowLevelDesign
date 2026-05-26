package DesignPatterns.Creational.FactoryPattern.good;

/*
 * Factory class responsible
 * for object creation.
 */
public class NotificationFactory {

    public static Notification
    createNotification(String type) {

        if(type.equals("EMAIL")) {

            return new EmailNotification();
        }

        else if(type.equals("SMS")) {

            return new SMSNotification();
        }

        else if(type.equals("PUSH")) {

            return new PushNotification();
        }

        throw new IllegalArgumentException(
                "Invalid notification type"
        );
    }
}
