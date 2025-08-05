import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
      
    //serialization means converting a state of object into byte stream
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Sanket";
        s1.stdId=1;

        String filepath="D:\\Java Practice\\Testfile.txt";
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(filepath);
            ObjectOutputStream oas=new ObjectOutputStream(fileOutputStream);
            oas.writeObject(s1);
            oas.close();
            fileOutputStream.close();
            System.out.println("File saved in folder");
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }


          
          

    }
}
