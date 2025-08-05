import java.util.Scanner;

public class ReverseStringBuilder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String reverse=sc.nextLine();
        StringBuilder sb=new StringBuilder(reverse);
        for(int i=0;i<sb.length()/2;i++){
            //getting 1st and last index
            int front=i;
            int back=sb.length()-1-i;

            //getting back and last characters 
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            //putting front  characters on last and last characters on 1st
             sb.setCharAt(front, backChar);
             sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
