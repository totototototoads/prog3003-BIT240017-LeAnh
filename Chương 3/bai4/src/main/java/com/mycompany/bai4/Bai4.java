package com.mycompany.bai4;

import java.util.concurrent.CompletableFuture;

public class Bai4 {

    public static void main(String[] args) {

        CompletableFuture<Void> checkProduct =
                CompletableFuture.runAsync(() -> {
                    sleep(2000);
                    System.out.println("✔ Kiểm tra sản phẩm hoàn tất");
                });

        CompletableFuture<Void> payment =
                CompletableFuture.runAsync(() -> {
                    sleep(3000);
                    System.out.println("✔ Thanh toán hoàn tất");
                });

        CompletableFuture<Void> shipping =
                CompletableFuture.runAsync(() -> {
                    sleep(2500);
                    System.out.println("✔ Vận chuyển hoàn tất");
                });

        CompletableFuture<Void> allTasks =
                CompletableFuture.allOf(checkProduct, payment, shipping);

        allTasks.thenRun(() ->
                System.out.println("🎉 Đơn hàng đã được xử lý xong!")
        );

        allTasks.join();
    }

    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
