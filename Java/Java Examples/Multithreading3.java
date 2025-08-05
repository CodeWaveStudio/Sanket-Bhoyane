public class Multithreading3 {
    public static void main(String[] args){
      Number1 t1=new Number1();
      Number2 t2=new Number2();
    t1.start();
    try {
        t1.join();  // Main thread waits for t1 to finish
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    t2.start();
   // t2.join();

      
    }
}
class Number1 extends Thread{
      
    public void run(){
        Thread.currentThread().setName("Thread 1");
          for(int i=1;i<=5;i++){
            try{
                Thread.sleep(300);
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
          catch(InterruptedException e){
            e.printStackTrace();
          }
          }
    }
}
class Number2 extends Thread{
    public void run(){
        Thread.currentThread().setName("Thread 2");
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(300);
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}
