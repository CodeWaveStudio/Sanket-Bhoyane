import java.util.Scanner;

public class Pattern6 {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int nmber=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(nmber+" ");
                nmber++;
            }
          
            System.out.println();
        }
    }
    
}
