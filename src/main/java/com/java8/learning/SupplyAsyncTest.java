package com.java8.learning;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/**
 * Run a task asynchronously and return the result using supplyAsync(
 * <p>
 * Created by rizvi on 3/1/18.
 */
public class SupplyAsyncTest {
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        CompletableFuture<Integer> intFuture = CompletableFuture.supplyAsync(new Supplier<Integer>() {
            @Override
            public Integer get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return 5;
            }
        });

        // Run a task specified by a Supplier object asynchronously
        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Result of the asynchronous computation";
            }
        });

// Block and get the result of the Future
        String result = future.get();
        System.out.println(result);

        int intResult = intFuture.get();
        System.out.println(intResult);
    }
}
