package practice_project_2;

public class SleepAndWait {

    public static void main(String[] args) {
        final Object lock = new Object();

        // Thread 1: Using sleep()
        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 is sleeping for 3 seconds.");
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 woke up after sleeping.");

        });

        // Thread 2: Using wait() and notify()
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Thread 2 is waiting...");
                try {
                    lock.wait(); // Waiting for notification
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 is notified and resumed.");
            }
        });

        thread1.start();
        thread2.start();

        try {
            // Sleep to ensure that Thread 2 starts waiting before Thread 1 finishes sleeping
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Notify Thread 2 to resume execution
        synchronized (lock) {
            lock.notify();
        }
    }
}
