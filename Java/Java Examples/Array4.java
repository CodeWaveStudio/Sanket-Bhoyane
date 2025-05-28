import java.util.Scanner;

public class Array4 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
     int size=sc.nextInt();
     int[] numbers=new int[size];
     boolean isAsc=true;
     //input 
     for(int i=0;i<size;i++){
        numbers[i]=sc.nextInt();
     }
  //output
  for(int i=0;i<numbers.length-1;i++){
       if(numbers[i]>numbers[i+1]){
         isAsc=false;
         break;
       }
  }
  if(isAsc){
    System.out.println("Array is in Assending order.");
  }
 else{
    System.out.println("Array is not in Assending order.");
 }

    }
}
