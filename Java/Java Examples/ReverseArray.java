import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter Size:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println(" Enter the Elements:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("The Entered Array:");
        for(int integer:arr){
            System.out.print(integer+" ");
        }
       System.out.println("");
        // assigning 1st and last values to i and j
        int i=0;
        int j=arr.length-1;
        //running while loop until i<j 
        while (i<j) {
            //swapp values
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
            i++;
            j--;

        }
        System.out.println("Reverse Array:");
        for(int integer:arr){
            System.out.print(integer+" ");
        }
               }
    }

