import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class Bai3 {
    public static void main(String[] args) {

        CompletableFuture<String> future =
            CompletableFuture.supplyAsync(() -> {
                return Arrays.asList(1, 2, 5, 3, 100);
            }).thenApply(list -> {
                return list.stream()
                        .filter(x -> x % 2 != 0)
                        .sorted()
                        .collect(Collectors.toList());
            }).thenApply(result -> {
                return "Kết quả là: " + result;
            });

        future.thenAccept(System.out::println);

        // Đợi async chạy xong
        future.join();
    }
}
