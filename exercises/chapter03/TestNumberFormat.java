import java.text.NumberFormat;

public class TestNumberFormat {
  public static void main(String []args) {
    Double myNumber = 12345.123456789;
    Double test = 1.2345;
    String myString = NumberFormat.getInstance().format(myNumber);
    System.out.println("默认格式: " + myString);
    myString = NumberFormat.getCurrencyInstance().format(myNumber);
    System.out.println("通用格式: " + myString);
    myString = NumberFormat.getNumberInstance().format(myNumber);
    System.out.println("通用数值格式: " + myString);
    myString = NumberFormat.getPercentInstance().format(test);
    System.out.println("百分比格式: " + myString);
    NumberFormat format = NumberFormat.getInstance();
    format.setMinimumFractionDigits(3);
    format.setMaximumFractionDigits(5);
    format.setMaximumIntegerDigits(10);
    format.setMinimumIntegerDigits(0);
    System.out.println(format.format(123456789.123456789));
  }
}