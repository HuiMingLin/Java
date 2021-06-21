import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharInput {
  public static void main(String args[]) throws IOException {
    String s;
    InputStreamReader ir;
    BufferedReader in;
    ir = new InputStreamReader(System.in);
    in = new BufferedReader(ir);
    while((s = in.readLine()) != null) {
      System.out.println("Read: " + s);
    }
  }
}