import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileToUnicode {
  public static void main(String args[]) {
    try {
      FileInputStream fis = new FileInputStream("./chapter07/FileToUnicode.java");
      InputStreamReader dis = new InputStreamReader(fis);
      BufferedReader reader = new BufferedReader(dis);
      String s;
      while((s = reader.readLine()) != null) {
        System.out.println("read: " + s);
      }
      dis.close();
    } catch(IOException e) {
      System.out.println(e);
    }
  }
}