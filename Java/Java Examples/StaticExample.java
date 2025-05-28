public class StaticExample {
    int empId;
     String name;
     static String companyName="Mars"; // u made company Name static so u can access it through directly class no need to create a obj to access it

     StaticExample(int empId,String name){
        this.empId=empId;
        this.name=name;
        
     }
     void display(){
    System.out.println(empId+" "+name+" "+companyName); 
    }

     public static void main(String [] args){
        StaticExample s=new StaticExample(1, "Sanket");
        s.display();
     }

}
