package com.java8.learning;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * If you want to run some background task asynchronously and
 * don’t want to return anything from the task,
 * then you can use CompletableFuture.runAsync() method
 * Created by rizvi on 3/1/18.
 */
public class RunAsyncTest {
    public static void main(String args[]) throws InterruptedException, ExecutionException {
        // Run a task specified by a Runnable Object asynchronously.
        CompletableFuture<Void> future = CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                // Simulate a long-running Job
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                System.out.println("I'll run in a separate thread than the main thread.");
            }
        });

// Block and wait for the future to complete
        future.get();
    }
}
