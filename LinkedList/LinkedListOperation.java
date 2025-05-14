public class LinkedListOperation {
     
      Node head=null;
 // insertion at beginning
    public void insertAtBeginning(int element){    
        Node newNode=new Node(element);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //insertion at end
    public void inserAtEnd(int element){

        Node newMode=new Node(element);

        if(head==null){
            head=newMode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newMode;
    }

    //insert at specific location

    public void insertAtSpPostion(int element,int position){
        Node newNode=new Node(element);
 
        if(position<0){
        System.out.println("Invalid Postion!");
        return;
        }
        if(position==0){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node temp=head;
        int index=0;
        while(temp.next!=null){
            if(index==position-1){               
               break;
            }
          temp=temp.next;
            index++;
        }
        if(temp.next==null){
            System.out.println("Position out of bound !");
            return;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

    //delete from beginning
    public void deleteFromBeginning(){
       if(head==null){
        System.out.println("List Is Empty !");
        return;
       }
        // Node temp=head;
        // int index=0;
        // while(temp.next!=null){
        //     if(index==0)break;
        //     temp=temp.next;
        //     index++;
        // }
        head=head.next;
      //  temp

    }

    public void deleteAtLast(){
        if(head==null){
            System.out.println("List Is Empty !");
            return;
           }
           if(head.next==null){
            head=null;
            return;
           }
        Node temp=head;
        while(temp.next.next!=null){   
            temp=temp.next;          
        }
        temp.next=null;
    }
    //delete from sp. position
    public void deleteAtPostion(int position){

     if(position<0){
      System.out.println("Invalid Postion !");
      return;
     }
     if(position==0){
        head=head.next;
        return;
     }
     Node temp=head;
     int index=0;
     while(temp!=null){
        if(index==position-1){
            break;
     }
     index++;
     temp=temp.next; 
    }
    temp.next=temp.next.next;
    }

    // search from list
    public boolean searchfromList(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    //print the linkedlist
    public void printList(){
        if(head==null){
            System.out.println("Linkedlist is empty !");
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next==null)
           System.out.print(temp.data);
           else
           System.out.print(temp.data+" =>");

           temp=temp.next;
        }
        System.out.println();
    }
}
