public class Main {
    public static void main(String[] args) {
        StackLinkedList stack=new StackLinkedList();

        stack.push(20);
        stack.push(10);
        stack.push(30);
          stack.display();
        stack.pop();
          stack.display();
        stack.peek();
        stack.display();
    }
}
