public class SharedOutput {

     boolean isprocess = true;

    public synchronized boolean isProcess() {
        return isprocess;
    }

    public synchronized boolean switchToggle() {
        isprocess =!isprocess;
        notify();
        return isprocess;
    }
}