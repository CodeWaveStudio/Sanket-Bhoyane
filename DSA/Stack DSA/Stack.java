public class Stack{

    private int[] array;
    private int size;
    private int top=0;

    public Stack(int n){
        this.size=n;
        this.top=-1;
        this.array=new int[size];           
    }

    //push operation
    public void push(int item){
    
     if(top>=size){
        System.out.println("Stack is full !");
        return;
     }
     else{
        top++;
        array[top]=item;
        System.out.println("Inserted:"+array[top]);
     }         // 1 2 3 4 
    }
     public boolean isEmpty(){
        if(top==-1){
           System.out.println("Stack Is Empty !");
           return true;
        }
        return false;
     }
  // display stack
  public void display(){
       if(!isEmpty()){
        System.out.println("top=>"+top);
        for(int i=0;i<=top;i++){
            System.out.print(array[i]+" ");
       } 
       System.out.println();
    }else{
        return;
    } 
  
    }

    // pop 
    public void pop(){
        if(!isEmpty()){
          System.out.println("Pop Element =>"+array[top]);
          top--;         
        }else{
            return;
        }
    }
    //peek
    public void peek(){
        if(!isEmpty()){
            System.out.println("Peek Element=>"+array[top]);
        }
        else{
            return;
        }
    }
}
