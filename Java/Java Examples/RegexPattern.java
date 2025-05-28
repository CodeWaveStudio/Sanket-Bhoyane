import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPattern {

    public static boolean checkPattern(String pattern){
        if(pattern== null){
            return false;
        }
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException e) {
            // TODO: handle exception
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String[] pattern=new String[n];
        for(int i=0;i<n;i++){
             pattern[i]=sc.nextLine();
        }
        sc.close();
        for(String pattern1:pattern){
            boolean result=checkPattern(pattern1);
            if(result){
               System.out.println("Valid");
            }else{
               System.out.println("Invalid");
            }
        }       
       
    }
}
