import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStreamTest {
  public static void main(String args[]) {
    Date d = null;

    try {
      FileInputStream f = new FileInputStream("./chapter07/data.ser");
      ObjectInputStream s = new ObjectInputStream(f);
      
      d = (Date)s.readObject();
      s.close();
    } catch(IOException e) {
      e.printStackTrace();
    } catch(ClassNotFoundException e) {
      e.printStackTrace();
    }
    System.out.println("Date serialized at " + d);
  }
}