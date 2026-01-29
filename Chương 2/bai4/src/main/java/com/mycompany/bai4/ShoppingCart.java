package com.mycompany.bai4;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("Vui lòng chọn phương thức thanh toán!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
