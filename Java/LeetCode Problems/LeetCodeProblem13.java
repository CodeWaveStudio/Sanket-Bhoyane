import java.util.Scanner;

public class LeetCodeProblem13 {
    

       public static int romanToInt(String s) {
           String[] symbols = {"CM","CD","XC","XL","IX","IV", "M","D","C","L","X","V","I"};
        int[] values = {900,400,90,40,9,4,1000,500,100,50,10,5,1};

        int num=0;
        int i=0;
        while(i<s.length()){
              boolean matched=false;
            if(i+1<s.length()){            
            String twoChar=s.substring(i,i+2);
               for(int j=0;j<symbols.length;j++){
                   if(symbols[j].equals(twoChar)){
                    num+=values[j];
                    matched=true;
                    i+=2;
                    break;
                   }
               } 
            }
            if(!matched){
                String oneChar=s.substring(i,i+1);
                for(int j=0;j<symbols.length;j++){
                    if(symbols[j].equals(oneChar)){
                        num+=values[j];
                        i+=1;
                        break;
                    }
                }
            }
        }
          return num;
        }
        public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        int num=romanToInt(n);
        System.out.println(num);
    }
}
