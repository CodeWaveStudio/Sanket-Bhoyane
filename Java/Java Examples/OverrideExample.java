public class OverrideExample {
   Object msg(){
    System.out.println("Im in class A");
    return null;
  }   
}
class B extends OverrideExample{
     String msg(){
        System.out.println("Im in class B");
        return null;
    }
    public static void main(String[] args){
        B b=new B();
        b.msg();
        OverrideExample a=new OverrideExample();
        a.msg();
    }
      
}
