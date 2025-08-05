import java.util.Scanner;

public class Array2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Row no:");
        int row=sc.nextInt();
        System.out.println("Enter Col no:");
        int col=sc.nextInt();
        int [][] numbers=new int[row][col];
        System.out.println("Enter X no:");
        int x=sc.nextInt();

        //take input
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                numbers[i][j]=sc.nextInt();
            }
        }

        //output
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(numbers[i][j]==x){
                    System.out.print("x is found at index "+ "( "+i+", "+j+")");
                    break;
                }
            }
        }
    }
    
}
