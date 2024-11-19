import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class day3 {
  public static void main (String[] args) {
    System.out.println("[A] Number of valid triangles: "+countTrianglesA("day3.txt"));
    System.out.println("[B] Number of valid triangles: "+countTrianglesB("day3.txt"));
  }

  private static boolean isValidTriangle(int a, int b, int c){
    return (a + b > c) && (a + c > b) && (b + c > a);
  }

  public static int countTrianglesA(String filename) {
    int count = 0;
    File file = new File (filename);
    try {
      Scanner input = new Scanner (file);
      //each line is processed into a new triangle scanner object
      while (input.hasNextLine()) {
        Scanner triangle = new Scanner(input.nextLine());
        while (triangle.hasNextInt()) {
          //the value of each integer is a side length of the triangle
          int s1 = triangle.nextInt();
          int s2 = triangle.nextInt();
          int s3 = triangle.nextInt();
          //if the sum of any two side lenghts is greater than the third, then it is a triangle
          if (isValidTriangle(s1,s2,s3)) {
            count ++;
          }
        }
        triangle.close();
      }
      input.close();
      //if the file is not found, return 0
    } catch (FileNotFoundException ex) {
      return 0;
    }
    return count;
  }

  public static int countTrianglesB(String filename) {
    int count = 0;
    try (Scanner scanner = new Scanner(new File(filename))) {
      while (scanner.hasNextLine()) {
        int [][] triangles = new int[3][3];
        for (int i=0; i<3; i++){
          Scanner triangle = new Scanner(scanner.nextLine());
          for (int j=0; j<3; j++){
            triangles[i][j] = triangle.nextInt();
          }
        }
        for (int i=0; i<3; i++){
          if (isValidTriangle(triangles[0][i], triangles[1][i], triangles[2][i])){
            count++;
          }
        }
      }
      return count;
    }
    catch (FileNotFoundException e) {
      return 0;
    }
  }
}
