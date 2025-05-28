import java.util.Scanner;

public class Array2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
         int size=sc.nextInt();
         sc.nextLine();//to remove leftover spaces
         String[] names=new String[size];
         System.out.println("Enter names:");
         for(int i=0; i<size;i++){
            names[i]=sc.nextLine();
            
         }
         System.out.println("Enter name to be search:");
         String findName=sc.nextLine();
         for(int i=0;i<names.length;i++){
            if(names[i].equals(findName)){
                System.out.println("Name found at index " +i);
                break; 
            }
           
           
         }
        
         sc.close();
    }
}
