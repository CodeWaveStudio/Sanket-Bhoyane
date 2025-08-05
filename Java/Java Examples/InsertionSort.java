import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }

        for(int i=1;i<arr.length;i++){
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key){
            arr[j+1]=arr[j];
            j--;
        }
        //insert key element to correct position
        arr[j+1]=key;
        }
        System.out.println();
        for(int num:arr){
        System.out.print(num+" ");
        }
    }
}
