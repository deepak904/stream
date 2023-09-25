package org.example.threadpool;

public class NumberPrinter implements Runnable{
    private int i;

    NumberPrinter(int i){
        this.i=i;
    }

    @Override
    public void run() {
        System.out.println("Number :" + i + " ,Thread :"+Thread.currentThread().getName());
    }
}
