package com.mycompany.bai2;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Gửi thông báo qua SMS");
    }
}
