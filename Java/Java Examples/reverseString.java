// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       System.out.println(reverseStringBuilder(s));
        System.out.println(reverseStringBuilderManually(s));
    }
    
    public static String reverseStringBuilder(String s){
        return new StringBuilder(s).reverse().toString();
    }
    
     public static String reverseStringBuilderManually(String s){
         StringBuilder sb=new StringBuilder();
         for(int i=s.length()-1;i>=0;i--){
         sb.append(s.charAt(i));
         }
         return  sb.toString();
     }
    
}