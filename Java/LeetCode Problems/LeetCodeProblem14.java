import java.util.Arrays;
import java.util.Scanner;

public class LeetCodeProblem14{

 public static String longestCommonPrefix(String[] strs) {
       if(strs.length==0) return "";
         
         String prefix=strs[0];
         for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
                 if(prefix.length()==0)return "";
            }
         }
         System.out.println("prefix->"+prefix);
             return prefix;
        }

    public static void main(String[] args) {
        System.out.println("Running............");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] inputStrs=new String[n];
        for(int i=0;i<inputStrs.length;i++){
            inputStrs[i]=sc.nextLine();
        }
       System.out.println(Arrays.asList(inputStrs));
       String outputStr=longestCommonPrefix(inputStrs);
      System.out.println("Longest Common String from strs-> "+outputStr);
    }
}