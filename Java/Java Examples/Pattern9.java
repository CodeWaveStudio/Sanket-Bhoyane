import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();

            for(int i=1;i<=n;i++){
                //1st half
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                //2nd half
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
                System.out.println();
            }
    }
    
}
