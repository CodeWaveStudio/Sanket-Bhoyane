import java.util.HashMap;
import java.util.Scanner;

public class HashMapProblem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String [] a=new String[N];
        HashMap<String,Integer>count=new HashMap<>();
        for(int i=0;i<N;i++){
          String name=sc.nextLine();
          a[i]=name;
        }
        System.out.println("Printing Array");
        for(String name1:a){
          
            System.out.println(name1);
            count.put(name1,count.getOrDefault(name1, 0)+1);
        }
        int maxFreq=0;
        for(int freq:count.values()){  
                maxFreq=Math.max(maxFreq,freq);
             
        }
        System.out.println("Most frequent keys and their count:");
        for(String key:count.keySet()){
            if(count.get(key)==maxFreq){
               System.out.println(key + "->" +count.get(key) );
            }
        }
    }
    
}
