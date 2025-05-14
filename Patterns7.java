import java.util.Scanner;

public class Patterns7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int m=sc.nextInt();
            int no=1;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    no=0;
                    System.out.print(no+" ");
                }else{
                    no=1;
                    System.out.print(no+" ");
                }
           
          
            }
            System.out.println();
        }
        
    }
    
}
