import java.util.Scanner;

public class Array3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int size=sc.nextInt();
        int[] numbers=new int[size];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
               min=numbers[i];
            }
            if(numbers[i]>mx){
                mx=numbers[i];
             }
        }
        System.out.println("Max No. is: "+mx);
        System.out.println("Min no. is: "+min);
    }
}
