import java.util.Scanner;

public class MaxMinArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter value : ");
        for(int i=0;i<size;i++){
          arr[i]=sc.nextInt();
        }
        System.out.println("Entered Array is : ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        //assigning max and min value
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            //if arr[i] is greater than max value then assigning that value to max
            if(arr[i]>max){
                 max=arr[i];
            }
             //if arr[i] is less than min value then assigning that value to min
            if(arr[i]<min){
                min=arr[i];//-1
            }
        }
        System.out.println("Max element is "+max);
        System.out.println("Min element is "+min);

    }
}
