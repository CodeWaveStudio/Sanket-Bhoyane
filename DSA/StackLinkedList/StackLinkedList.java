public class StackLinkedList {

    private Node top;

    public StackLinkedList(){
        this.top=null;
    }

    //push
    public void push(int data) {
     
        Node node=new Node(data);
        node.next=top;
        top=node;
    }

    //pop
    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            int value=top.data;
            top=top.next;
            System.out.println("Pop Value=>"+value);
            return value;
        }
    }

    //peek
     public int peek() {
        if(isEmpty()){
            return -1;
        }
        else{
            int value=top.data;
            System.out.println("Peek Value=>"+value);
            return value;
        }
     }

    //isEmpty
    public boolean isEmpty(){
           if(top==null){
            System.out.println("Stack is empty !");
            return true;
           }
           else{
            return false;
           }
    }

    //display

    public void display(){
        if(isEmpty()){
            return ;
        }
        else{
            Node temp=top;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    
}
