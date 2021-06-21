import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
  public static void main(String args[]) {
    try {
      BufferedReader in = new BufferedReader(new FileReader("./chapter07/myAccount2.txt"));
      BankAccount aBankAccount = new BankAccount();
      aBankAccount.setOwnerName(in.readLine());
      aBankAccount.setAccountNumber(Integer.parseInt(in.readLine()));
      in.read();
      aBankAccount.deposit(Float.parseFloat(in.readLine()));
      in.close();
      System.out.println(aBankAccount);
      System.out.println(aBankAccount.getOwnerName() + ' ' + aBankAccount.getAccountNumber() + ' ' + aBankAccount.getBalance());

    } catch(FileNotFoundException e) {
      System.out.println("Error: Cannot open file for reading.");
    } catch(EOFException e) {
      System.out.println("Error: EOF encountered, file may be corrupted.");
    } catch(IOException e) {
      System.out.println("Error: Cannot read from file.");
    }
  }  
}