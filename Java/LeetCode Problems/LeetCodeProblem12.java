import java.util.Scanner;

public class LeetCodeProblem12 {

    public static String intToRoman(int num) {
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
       StringBuilder roman=new StringBuilder();
        for(int i=0;i<values.length && num>0;i++){
            while(num>=values[i]){
                roman.append(symbols[i]);
                num-=values[i];
              //  System.out.println("num->"+num+" "+"roman->"+roman.toString() );
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String romanWords=intToRoman(n);
        System.out.println(romanWords);
    }
}