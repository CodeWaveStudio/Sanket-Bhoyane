import java.util.Scanner;

public class MissingNoFromSortedArray {
    
    public static int[] sortedArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
         }
         System.out.println("sorted array:");
        return arr;         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }      
         int[] arr1=sortedArray(arr);
         for(int i:arr1){
           System.out.print(i+" ");
         }

    }
}
