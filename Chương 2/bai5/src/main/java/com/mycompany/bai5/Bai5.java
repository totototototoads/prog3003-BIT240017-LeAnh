package com.mycompany.bai5;

public class Bai5 {
    public static void main(String[] args) {
        Notification notification = new Notification();

        notification.setMessageService(new EmailService());
        notification.notifyUser("Xin chào qua Email");

        notification.setMessageService(new SMSService());
        notification.notifyUser("Xin chào qua SMS");
    }
}