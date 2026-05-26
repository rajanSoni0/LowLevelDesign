package DesignPatterns.Creational.FactoryPattern.good;

/*
 * Service now depends on abstraction.
 */
public class NotificationService {

    public void sendNotification(String type) {

        Notification notification
                = NotificationFactory
                .createNotification(type);

        notification.send();
    }
}
