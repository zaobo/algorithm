package com.zab.algorithm;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class LeetCode1115 {

    public static void main(String[] args) throws InterruptedException {
        FooBar fooBar = new FooBar(2);
        new Thread(()-> {
            try {
                fooBar.foo(() -> System.out.println("foo"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(()-> {
            try {
                fooBar.bar(() -> System.out.println("bar"));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

}

class FooBar {
    private int n;

    private Semaphore aa = new Semaphore(1);
    private Semaphore bb = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            aa.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bb.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            bb.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            aa.release();
        }
    }
}