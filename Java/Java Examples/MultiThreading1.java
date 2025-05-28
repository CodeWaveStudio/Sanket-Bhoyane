public class MultiThreading1 {
    public static void main(String [] args){
        Increament increament=new Increament();
        //creating 2 threads
        Thread t1=new Thread(increament,"Thread 1");
        Thread t2=new Thread(increament,"Thread 2");

       
        try{
          
            t1.start(); 
        t1.join();     
        t2.start();
        t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
     
   System.out.println("Both Thread Executed");

    }
}

class Increament implements Runnable{

    private final Object lock=new Object();//creating lock obj to syncronize thread execution

    public void run(){
    for(int i=1;i<=10;i++){
        synchronized(lock){// Synchronize the printing of numbers
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
 
    }
    }
}
