import java.util.ArrayList;
import java.util.List;


public class Publisher {
    
    private List<Subscriber> subscribers=new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void publish(String message){
      for(Subscriber sub:subscribers){
        sub.update(message);
      }
    }
}
