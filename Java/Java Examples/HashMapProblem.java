import java.util.HashMap;
import java.util.Scanner;

public class HashMapProblem {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.nextLine();
        String [] name=new String[N];
        HashMap<String,Integer> count=new HashMap<>();
        for(int i=0;i<N;i++){
            String names=sc.nextLine();
            name[i]=names;
        }
        for(String name1:name){
            System.out.println(name1);
            count.put(name1,count.getOrDefault(name1, 0)+1);
        }
         System.out.println(count);
     }
}
