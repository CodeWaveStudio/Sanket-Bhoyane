import java.util.Scanner;

public class RecurssionXpowerN {

    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int n=sc.nextInt();
    
    int ans=printXpowerN(x,n);
    System.out.println(ans);
    }
    public static int printXpowerN(int x,int n){
         if(n==0){   //base case 1 
         return 1;   
        }
        if(x==0){    //base case 2
            return 0;
           }
        int xPowernmin1=printXpowerN(x, n-1);
        int xPowerN=x*xPowernmin1;   //x power of n=x power of n * x power of n-1
           return xPowerN;
    }
}
