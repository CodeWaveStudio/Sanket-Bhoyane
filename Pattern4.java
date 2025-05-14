import java.util.Scanner;

public class Pattern4 {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    //upper half
    for(int i=1;i<=n;i++){
      //left half
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        //right half
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();

    }
    //bottom half
    for(int i=n;i>=1;i--){
        //left half
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        //right half
        for(int j=1;j<=n-i;j++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
    
}
