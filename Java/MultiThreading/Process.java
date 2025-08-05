public class Process implements Runnable {

    SharedOutput c=new SharedOutput();

    public Process(SharedOutput s) {
        c=s;
    }


    public void run() {
        synchronized (c) {
            for (int i = 1; i <= 10; i++) {
                while (!c.isProcess()) {
                    try {
                        c.wait(); // Wait for Multithread1's turn
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Production of Products " + i);
                c.switchToggle();
            }
        }
    }
}