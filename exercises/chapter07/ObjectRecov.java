import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectRecov implements Serializable {
  public static void main(String args[]) {
    try {
      Student stu;
      FileInputStream fi = new FileInputStream("./chapter07/data.ser");
      ObjectInputStream si = new ObjectInputStream(fi);
      stu = (Student)si.readObject();
      si.close();
      System.out.println("ID: " + stu.id + "; name: " + stu.name + "; age: " + stu.age + "; dept.: " + stu.department);
    } catch(Exception e) {
      System.out.println(e);  
    }
  }
}