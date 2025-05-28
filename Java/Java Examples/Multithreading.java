class Increment extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread1: " + i);
        }
    }
}

class Increment2 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread2: " + i);
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Thread t1 = new Increment();
        Thread t2 = new Increment2();

        try {
            t1.start(); // Start Thread1
            t1.join();  // Main thread waits for Thread1 to finish

            t2.start(); // Start Thread2
            t2.join();  // Main thread waits for Thread2 to finish
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle any interruptions
        }

        System.out.println("Both threads have finished execution!");
    }
}
