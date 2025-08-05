import java.util.Scanner;

public class Main {
    
   static LinkedListOperation list=new LinkedListOperation();
       
  static Scanner scanner=new Scanner(System.in);
  
   public static void printMenu(){
      System.out.println("Press 1 for insertion => "+1);
      System.out.println("Press 2 for deletion => "+2);
      System.out.println("Press 3 for search => "+3);
      System.out.println("Press 4 for exit => "+4);
      System.out.println("Enter Your Choice : ");

      try {
         int choice=scanner.nextInt();
         if(choice==1){
          printInsert();
        
         }
         else if(choice==2){
           printDelete();
         }
         else if(choice==3){
           printSearch();
         }
         else if(choice==4){
           scanner.close();
           System.out.println("Application is closed !");
         }
         else{
           System.out.println("Invalid Outut !");
         }
         printMenu();
      } 
     
       catch (Exception e) {
         e.getMessage();
         System.out.println("App Is closed !");
      }
   }

   public static void printInsert(){
      System.out.println("Press 1 for insert from head => "+1);
      System.out.println("Press 2 for insert from tail => "+2);
      System.out.println("Press 3 for insert from Position => "+3);
      System.out.println("Press 4 to go back => "+4);
      System.out.println("Enter Your Choice : ");
      int insertChoice=scanner.nextInt();
      if(insertChoice==1){
       System.out.println("Enter the Number to Insert :");
       int element=scanner.nextInt();
       System.out.println("Result :");
        list.insertAtBeginning(element);
        list.printList();
      }
     else if(insertChoice==2){
       System.out.println("Enter the Number to Insert :");
       int element=scanner.nextInt();
       System.out.println("Result :");
        list.inserAtEnd(element);
        list.printList();
      }
      else if(insertChoice==3){
       System.out.println("Enter the Number to Insert :");
       int element=scanner.nextInt();
       System.out.println("Enter the Postion at Insert :");
       int position=scanner.nextInt();
       System.out.println("Result :");
        list.insertAtSpPostion(element, position);
        list.printList();
      }
      else{
        printMenu();
      }
   }
   public static void printDelete(){
      System.out.println("Press 1 for delete from head => "+1);
      System.out.println("Press 2 for delete from tail => "+2);
      System.out.println("Press 3 for delete from Position => "+3);
      System.out.println("Press 4 to go back => "+4);
      int deleteChoice=scanner.nextInt();
      if(deleteChoice==1){
      // System.out.println("Enter the Number to Delete :");
      // int element=scanner.nextInt();
       System.out.println("Result :");
        list.deleteFromBeginning();
        list.printList();
      }
     else if(deleteChoice==2){
      //  System.out.println("Enter the Number to Insert :");
      //  int element=scanner.nextInt();
       System.out.println("Result :");
        list.deleteAtLast();
        list.printList();
      }
      else if(deleteChoice==3){
      //  System.out.println("Enter the Number to Insert :");
      //  int element=scanner.nextInt();
       System.out.println("Enter the Postion at Delete :");
       int position=scanner.nextInt();
       System.out.println("Result :");
        list.deleteAtPostion(position);
        list.printList();
      }
      else{
        printMenu();
      }
   }
   public static void printSearch(){
      System.out.println("Press 4 to go back => "+1);
      System.out.println("Enter The Search Number => ");
      int searchChoice=scanner.nextInt();
      if(searchChoice!=1){
         System.out.println("Result :");
         list.searchfromList(searchChoice);
         
      }
      else{
         printMenu();
      }
   }
    public static void main(String[] args) {
      System.out.println("**************Welcome To Linked List App***************** ");
     
    
     
      printMenu();

     

      System.out.println("**********************");
       // LinkedList list=new LinkedList<>();

   //     

   //     list.insertAtBeginning(10);
   //     list.insertAtBeginning(20);
   //     list.insertAtBeginning(30);
   //  list.inserAtEnd(70);
   //  list.inserAtEnd(90);
   //  list.insertAtSpPostion(50, 4);
   //   list.deleteFromBeginning();
   //   list.deleteAtLast();
   //  list.deleteAtPostion(2);
  
   //     list.printList();
   //     boolean result= list.searchfromList(50);
   //     if(result)
   //         System.out.println("yes "+ 50+ " is present in list");
        
    }
}
