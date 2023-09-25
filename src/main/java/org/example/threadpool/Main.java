package org.example.threadpool;

import java.time.LocalTime;
import java.util.Date;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException,InterruptedException {

//        for (int i = 1; i <= 100; i++) {
//            NumberPrinter numberPrinter = new NumberPrinter(i);
//            Thread thread = new Thread(numberPrinter);
//            thread.start();
//        }

//        ExecutorService executor = Executors.newFixedThreadPool(10);
//        for (int i = 1; i <= 100; i++) {
//            NumberPrinter numberPrinter=new NumberPrinter(i);
//            executor.submit(numberPrinter);
//        }

        System.out.println(LocalTime.now());
        ExecutorService executor = Executors.newFixedThreadPool(2);

        RandomGenerator randomGenerator1 = new RandomGenerator();
        RandomGenerator randomGenerator2 = new RandomGenerator();

        Future<Integer> value1 = executor.submit(randomGenerator1);
        Future<Integer> value2 = executor.submit(randomGenerator1);
        System.out.println(LocalTime.now());
        Integer integer1 = value1.get();
        Integer integer2 = value2.get();
        System.out.println(LocalTime.now());

        System.out.println("SUM :"+ (integer2+integer1) + " ,Thread :" +Thread.currentThread().getName());
        System.out.println(LocalTime.now());

    }
}
