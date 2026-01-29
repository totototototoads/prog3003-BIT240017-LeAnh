package com.mycompany.bai4;

public class PayPalPayment implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Thanh toán " + amount + " bằng PayPal");
    }
}
