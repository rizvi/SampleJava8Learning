package com.java8.learning;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * If you want to run some background task asynchronously and
 * don’t want to return anything from the task,
 * then you can use CompletableFuture.runAsync() method
 *
 * Created by rizvi on 3/1/18.
 */
public class RunAsyncLambdaTest {
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        // Using Lambda Expression
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulate a long-running Job
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");
        });

        future.get();
    }
}
