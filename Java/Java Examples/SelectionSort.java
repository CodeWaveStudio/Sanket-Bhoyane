import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //defining size of array
        int size=sc.nextInt();
        int[] arr=new int[size]; //declaring int array
        for(int i=0;i<size;i++){  //taking input for int[size] array
       arr[i]=sc.nextInt();
        }
        //0=2 1=5
        for(int i=0;i<arr.length-1;i++){ //outer loop to traverse the array upto last index
            int minIndex=i;//0
            for(int j=i+1;j<arr.length;j++){  //inner loop to traverse from next index of i to last index
             
              if(arr[j]<arr[minIndex]){  //compare arr[j] value is less that minindex value then chnaging minindex value 
                minIndex=j;//1
              }
              //swap the min value at first index
              int temp=arr[minIndex];//2
              arr[minIndex]=arr[i];//2
              arr[i]=temp;
            }
    }  
    System.out.println();
    System.out.println("Sorted Array:");
    //printing sorted array
    for(int num:arr){
        System.out.print(num+" ");
    }
   
}  
}
