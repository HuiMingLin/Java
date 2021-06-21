import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamTest {
  public static void main(String args[]) {;
    try {
      Date d = new Date();
      FileOutputStream f = new FileOutputStream("./chapter07/data.ser");
      ObjectOutputStream s = new ObjectOutputStream(f);
      s.writeObject(d);
      s.close();
    } catch(IOException e) {
      e.printStackTrace();
    }
  }
}