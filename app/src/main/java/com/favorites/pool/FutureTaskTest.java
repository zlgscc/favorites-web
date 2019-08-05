package com.favorites.pool;

import javafx.concurrent.Task;

import java.util.concurrent.*;

public class FutureTaskTest {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newCachedThreadPool();
        FutureTask task = new FutureTask();

        Future<Integer> result = executor.submit(task);
        executor.shutdown();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果"+result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }
}
