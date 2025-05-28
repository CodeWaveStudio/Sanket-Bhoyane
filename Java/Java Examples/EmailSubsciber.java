

public class EmailSubsciber implements Subscriber {

     private String name;

     public EmailSubsciber(String name){
        this.name=name;
     }

     @Override
    public void update(String message) {
        System.out.println(name + " received email: " + message);
    }
}
