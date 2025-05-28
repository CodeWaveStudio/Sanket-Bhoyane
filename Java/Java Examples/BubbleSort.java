import java.util.Scanner;

public class BubbleSort{

    public static void printArr(int[] arr){
        System.out.println("Sorted Array:");
     for(int i:arr){
        System.out.print(i+" ");
     }   
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size Of The Array:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter The Values Of The Array:");
        for(int i=0;i<size;i++){
             arr[i]=sc.nextInt();
        }
        System.out.println("The Values Of The Array:");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
        for(int i=0;i<arr.length-1;i++){    
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        System.out.println();
        printArr( arr);

    }
}