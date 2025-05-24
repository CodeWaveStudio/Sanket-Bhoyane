import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of array :");
        int n=sc.nextInt();
        Stack stack=new Stack(n);
         stack.push(10);
         stack.push(20);
         stack.push(30);
        stack.display();
        stack.pop();
        stack.display();
        stack.pop();
        stack.display();
        stack.peek();
    }
}
