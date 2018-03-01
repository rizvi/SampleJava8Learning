package com.java8.learning;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.sql.Time;
import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 * Created by rizvi on 3/1/18.
 */
public class SupplyAsyncLambdaTest {
    public static void main(String args[]) throws InterruptedException, ExecutionException {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello World";
        });

        String result = future.get();
        System.out.println(result);

        CompletableFuture<Integer> integerCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 4;
        });

        Integer intResult = integerCompletableFuture.get();
        System.out.println(intResult);

        Executor executor = Executors.newFixedThreadPool(10);
        CompletableFuture<String> futureExecutor = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation";
        }, executor);

        String result2 = futureExecutor.get();
        System.out.println(result2);
    }
}
