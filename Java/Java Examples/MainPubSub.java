public class MainPubSub {
    public static void main(String[] args) {
   
        Publisher publisher=new Publisher();

        Subscriber john=new EmailSubsciber("John") ;
        Subscriber Ellisa=new SmsSubscriber("1234567890");

           publisher.subscribe(john);
           publisher.subscribe(Ellisa);

           publisher.publish("Breaking News: Java makes coding easy!");

           publisher.unsubscribe(john);

           publisher.publish("Update: John unsubscribed.");

    }
}
