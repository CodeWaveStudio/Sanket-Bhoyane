
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        Scanner sc=new Scanner(System.in);
       
        int n=sc.nextInt();
        int[] num=new int[n];
         System.out.println("Enter " + n + " integers:");
         for(int i=0;i<n;i++){
          num[i]=sc.nextInt();
             
         }
          System.out.println("Enter Target :");
        int target=sc.nextInt();
       int[] result=getIndices(num,target);
       System.out.println(result[0]+" "+result[1]);
}
    
    public  static int[] getIndices(int[] num,int target){
      Map<Integer,Integer> visitedNum=new HashMap<>();
      for(int i=0;i<num.length;i++){
           int delta=target-num[i];
           if(visitedNum.containsKey(delta)){
               return new int[]{visitedNum.get(delta),i};
           }
          visitedNum.put(num[i],i);
      }
      return new int[]{-1,-1};
    }

}