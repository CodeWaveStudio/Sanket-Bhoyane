import java.util.Scanner;

public class RegexUserName {
    public static final String isvalid="^[a-zA-Z][a-zA-Z0-9_-]{7,29}$";

    public static void main(String[] args) {

       //private static final
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Usernames:");
        String[] username=new String[n];
        for(int i=0;i<username.length;i++){
            username[i]=sc.nextLine();
        }
        System.out.println("The Output Is:");
             for(String username1:username){
                if(username1.matches(isvalid)){
                    System.out.println("valid");
                  }
                  else{
                      System.out.println("Invalid");
                  }
             }
        
       
    }
    
}
