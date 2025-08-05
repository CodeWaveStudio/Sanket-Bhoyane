import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        SharedOutput common = new SharedOutput();
        Process production = new Process(common);
        Multithread1 consumer = new Multithread1(common);

        new Thread(production).start();
        new Thread(consumer).start();
    }
}