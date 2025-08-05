import java.util.Scanner;
import java.util.Stack;

public class IsNumberPalindrome{

public static boolean isPalindrome(int x) {
        if(x<0) return false;   
       Stack<Integer> originalStack = new Stack<>();
        Stack<Integer> revStack = new Stack<>();
        while(x>0){
            int digit=x%10;
            System.out.println("digit->"+digit);
            x=x/10;
            originalStack.push(digit);
             revStack.add(0,digit);       
        } 
         System.out.println("originalStack->"+originalStack.toString());
         System.out.println("revStack->"+revStack.toString());
        if(originalStack.equals(revStack)){
            return true;
        }
        else{
            return false;
        }   
        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
         System.out.println(isPalindrome(x)); 
        
    }




}