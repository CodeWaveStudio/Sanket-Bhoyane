import java.util.Scanner;

public class SecondLargestNumber {

    public static int findSecondlargest(int[] arr){

        int first=Integer.MIN_VALUE,secoond=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>first){
                secoond=first;
                first=a;
            }
            else if(a<first && a>secoond){
                secoond=a;
            }

        }
        return secoond;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int [] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }
         for(int num:arr){
            System.out.print(num);
         }

         System.out.println("Second largest number is :"+findSecondlargest(arr));
    }
}
