package com.mycompany.bai4;

public class Bai4 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        // Thanh toán bằng Credit Card
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(500);

        // Đổi sang PayPal lúc runtime
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(300);
    }
}
