import java.util.Scanner;

public class Patterns8 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
      }
      for(int j=1;j<=m;j++){
        System.out.print("*");
  }
  System.out.println();
}}
}
