import java.util.Scanner;

public class RecurssionFabuancii {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=0,b=1;
    System.out.println(a);
    System.out.println(b);
    printFab(a,b,n-2);
    }
    public static void printFab(int a,int b,int n){
        //base case
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFab(b, c, n-1);
    } 
}
