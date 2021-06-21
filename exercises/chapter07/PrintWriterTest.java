import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest {
  public static void main(String args[]) {
    try {
      PrintWriter out = new PrintWriter(new FileWriter("./chapter07/myAccount2.txt"));
      BankAccount aBankAccount = new BankAccount("LiuWei", 2017);
      out.println(aBankAccount.getOwnerName());
      out.println(aBankAccount.getAccountNumber());
      out.println("$" + aBankAccount.getBalance());
      out.close();
    } catch(FileNotFoundException e) {
      System.out.println("Error: Cannot open file for writing");
    } catch(IOException e) {
      System.out.println("Error: Cannot write to file.");
    }
  }  
}