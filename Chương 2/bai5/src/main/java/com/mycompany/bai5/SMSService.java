package com.mycompany.bai5;

class SMSService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi SMS: " + message);
    }
}