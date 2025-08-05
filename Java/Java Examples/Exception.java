public class Exception {
    public static void main(String [] args){
        int[] a=new int[4];
        for(int i=0;i<4;i++){
            a[i]=i;
        }
  try{
    System.out.println(a[5]);
  }
  catch(Exception e){
    System.out.println("Error");
  }
  System.out.println("Done");

      
    }
   
}
