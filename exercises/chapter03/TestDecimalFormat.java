import java.util.Scanner;
import java.text.DecimalFormat;

public class TestDecimalFormat {
  public static void main(String []args) {
    int age;
    double weight, height, bmi;
    Scanner scan = new Scanner(System.in);
    System.out.print("请输入年龄: ");
    age = scan.nextInt();
    System.out.print("请输入体重(公斤): ");
    weight = scan.nextDouble();
    System.out.print("请输入身高(米): ");
    height = scan.nextDouble();
    bmi = weight / (height * height);
    DecimalFormat fmt = new DecimalFormat("0.###");
    System.out.println("BMI: " + fmt.format(bmi));
    fmt = new DecimalFormat("0.##");
    System.out.println("BMI: " + fmt.format(bmi));
  }
}