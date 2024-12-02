import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.ArrayList;

public class day6 {
  public static void main(String[] args){
    //System.out.println(Arrays.toString(parse("day1.txt")));
    //System.out.println(mostFrequentChar("happpy"));
    System.out.println(solve(parse("day6.txt")));
  }
  public static String[] parse(String filename){
    try {
      File file = new File (filename);
      Scanner info = new Scanner (file);
      String data = "";
      while (info.hasNextLine()) {
        data += info.nextLine()+"\n";
      }
      info.close();
      return data.trim().split("\n");
    } catch (FileNotFoundException e) {
      return new String[0];
    }
  }

  public static String solve (String[] data) {
    int columns = data[0].length();
    char[] result = new char[columns];
    for (int col = 0; col < columns; col++) {
      String columnData = "";
      for (int i = 0; i < data.length; i++) {
        columnData += data[i].charAt(col);
      }
      result[col] = mostFrequentChar(columnData.toString());
    }
    return new String(result);
  }

  public static char mostFrequentChar (String data) {
    int maxCount = 0;
    char mostFrequent = 'a';
    for (char c = 'a'; c <= 'z'; c++) {
      int count = 0;
      for (int i = 0; i < data.length(); i++) {
        if (data.charAt(i) == c) {
          count ++;
        }
      }
      if (count > maxCount) {
        maxCount = count;
        mostFrequent = c;
      }
    }
    return mostFrequent;
  }
}
