public class SingetonClass {
    //singlton class has only one object
    private static SingetonClass singetonClass=null;

    //singlton class can be create using private constructor
    private SingetonClass(){

    }
  //singlton class can be create with static method so no need to create a obj of this class to call static method
    public static SingetonClass getSingetonClass(){
          if(singetonClass==null){
           singetonClass=new SingetonClass();
          }
        return singetonClass;
    }

//refer test.java for next operation
}
