package org.example.threadpool;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomGenerator implements Callable {
    @Override
    public Integer call() throws Exception {
        Thread.sleep(5000);
        Random random = new Random();

        Integer i = random.nextInt();
        System.out.println("Random number generated :"+ i + ", Thread :"+ Thread.currentThread().getName());

        return i;
    }
}
