import java.util.Scanner;

public class RecurssionFactorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=calculateFact(n);
        System.out.println(ans);
    }
    public static int calculateFact(int n){
        if(n==1 || n==0){
        return 1;
        }
        int fact_minone=calculateFact(n-1);//5=cal(4)   4=cal(3)  3=cal(2)  2=cal(1)
        int fact=n*fact_minone;           // 2*1=2   
        return fact;    
}
}
