package com.mycompany.bai5;

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Gửi Email: " + message);
    }
}