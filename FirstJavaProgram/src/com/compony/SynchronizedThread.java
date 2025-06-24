package com.compony;

class Counter {
    int count = 0;
    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }
}

class MySyncThread extends Thread {
    Counter counter;

    public MySyncThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); // Using the synchronized method
        }
    }
}

public class SynchronizedThread{
    public static void main(String[] args) {
        // In main method:
        Counter sharedCounter = new Counter();
        MySyncThread t1 = new MySyncThread(sharedCounter);
        MySyncThread t2 = new MySyncThread(sharedCounter);

        t1.start();
        t2.start();

        try {
            t1.join(); // Wait for t1 to finish
            t2.join(); // Wait for t2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + sharedCounter.count); // Should be 2000 due to synchronization
    }
}