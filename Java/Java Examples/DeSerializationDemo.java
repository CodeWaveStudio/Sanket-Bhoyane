import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {
    //deserialization means converting bytestream into object
    public static void main(String[] args) {
        
       String filepath="D:\\Java Practice\\Testfile.txt";

       try {
        FileInputStream fis=new FileInputStream(filepath);
        ObjectInputStream ois=new ObjectInputStream(fis);

        Student s1=(Student) ois.readObject();
        System.out.println(s1.stdId+" : "+s1.name);
         ois.close();
         fis.close();
       } catch (ClassNotFoundException e) {
        e.printStackTrace();
        // TODO: handle exception
       }
       catch (IOException e) {
        e.printStackTrace();
        // TODO: handle exception
       }

    }
}
