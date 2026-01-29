package com.mycompany.bai2;

public class Bai2 {
    public static void main(String[] args) {

        Notification n1 = NotificationFactory.createNotification("sms");
        n1.notifyUser();

        Notification n2 = NotificationFactory.createNotification("email");
        n2.notifyUser();

        Notification n3 = NotificationFactory.createNotification("push");
        n3.notifyUser();
    }
}
