import java.util.Scanner;

public class IsStringPalindrome {

    public static boolean isPalindrome(String a){
        int left=0,right=a.length()-1;
        while(left<right){
            if(a.charAt(left)!=a.charAt(right)) return false;
            left++;
            right--;
            
        }
     return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
