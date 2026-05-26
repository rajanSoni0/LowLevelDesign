package DesignPatterns.Creational.FactoryPattern.good;

public class Main {

    public static void main(String[] args) {

        NotificationService service
                = new NotificationService();

        service.sendNotification("EMAIL");

        service.sendNotification("SMS");

        service.sendNotification("PUSH");
    }
}