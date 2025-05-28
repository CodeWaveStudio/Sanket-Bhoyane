import java.util.Scanner;

public class Array1{
    public static void main(String [] args){
     
        Scanner sc=new Scanner(System.in);
        System.out.println("Write size of array:");
        int size=sc.nextInt();
        int[] number=new int[size];
       
        System.out.println("Write numbers in array:");
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        System.out.println("Write the number to be search:");
        int x=sc.nextInt();
        for(int i=0;i<number.length;i++){
           if(number[i]==x){
            System.out.println("the number is found at index "+i);
            break;
           }
           // System.out.println(number[i]);
        }
        sc.close();
    }
}