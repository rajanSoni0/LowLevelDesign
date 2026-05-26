package DesignPatterns.Creational.FactoryPattern.bad;

/*
 * BAD DESIGN:
 * Service directly creates objects.
 */
public class NotificationService {

    public void sendNotification(String type) {

        if(type.equals("EMAIL")) {

            EmailNotification email
                    = new EmailNotification();

            email.send();
        }

        else if(type.equals("SMS")) {

            SMSNotification sms
                    = new SMSNotification();

            sms.send();
        }
    }
}
