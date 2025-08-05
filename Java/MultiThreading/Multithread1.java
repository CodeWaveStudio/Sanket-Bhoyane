public class Multithread1 extends Thread {

    SharedOutput c=new SharedOutput();

    public Multithread1(SharedOutput s) {
    c=s;
    }

   
    public void run() {
        synchronized (c) {
            for (int i = 1; i <= 10; i++) {
                while (c.isProcess()) {
                    try {
                        c.wait(); // Wait for Process's turn
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Consumer consume " + i);
                c.switchToggle();
            }
        }
    }
}
