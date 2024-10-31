import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main (String[] args) {
    System.out.println(countTrianglesA("inputTri.txt"));
  }
  public static int countTrianglesA(String filename) {
    int count = 0;
    Scanner input = new Scanner(filename);
    while (input.hasNextLine()) {
      Scanner triangle = new Scanner(input.nextLine());
      while (triangle.hasNextInt()) {
        int s1 = triangle.nextInt();
        int s2 = triangle.nextInt();
        int s3 = triangle.nextInt();
        if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
          count ++;
        }
      }
    }
    return count;
  }
}
