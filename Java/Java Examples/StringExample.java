public class StringExample{
    public static void main(String[] args) {
        
        String s1=new String("Sanket");//1 obj in heap and 1 in SCP
        String s2=new String("Sanket");//1 obj in heap 
        String s3="Sanket";
        String s4="Sanket";
        String s5=new String("ANiket");
        String s6=new String("ANiket");

        if(s1==s2){
            System.out.println("true");

        }
        if(s1.equals(s2)){
            System.out.println("s1.equals(s2) is true");
        }
        if(s2.equals(s3)){
            System.out.println(" s2.equals(s3) is true");
        }
        if(s2==s3){
            System.out.println(" s2==s3 is true");
        }
        if(s2==s3){
            System.out.println(" s2==s3 is true");
        }
        if(s3==s4){
            System.out.println(" s3==s4 is true");
        }
        if(s3.equals(s4)){
            System.out.println(" s3.equals(s4) is true");
        }
        if(s5==s6){
            System.out.println(" s5==s6 is true");
        }
        
       
    }
}