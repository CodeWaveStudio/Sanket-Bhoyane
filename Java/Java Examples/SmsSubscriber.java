public class SmsSubscriber implements Subscriber {

    private String phone;

    public SmsSubscriber(String phone){
     this.phone=phone;
    }
    @Override
    public void update(String msg){
        System.out.println("SMS to " + phone + ": " + msg);
    }
    
}
