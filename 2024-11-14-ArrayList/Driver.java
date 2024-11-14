import java.util.ArrayList;
public class Driver {
  public static void main (String[] args) {
    ArrayList<String>a1;
    a1 = ArrayListPractice.createRandomArray(5);
    System.out.println(a1);
    ArrayList<String>a2;
    a2 = ArrayListPractice.createRandomArray(300000);
    System.out.println(a2);
  }
}
