import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.sound.sampled.Line;
import java.util.Arrays;

public class day2 {
  public static void main(String[] args){
    System.out.println(Arrays.toString(parse("day2.txt")));
    //System.out.println(solve(parse("day1.txt")));
  }
  public static String[] parse(String filename){
    ArrayList<String> vals = new ArrayList<String>();
    try {
      File file = new File (filename);
      Scanner info = new Scanner (file);
      while (info.hasNext()) {
        vals.add(info.next());
      }
      String[] val = new String[vals.size()];
      for (int i = 0; i < vals.size(); i ++) {
        val[i] = vals.get(i);
      }
      return val;
    } catch (FileNotFoundException e) {
      return new String[0];
    }
  }
  public static int solve (String[] data) {
    int[][] keys = {{1,2,3}, {4,5,6}, {7,8,9}};
    int[] code = new int[data.length()];
    for (int i = 0; i < data.length(); i++) {
      int input = 5;
      String line = data[i];
      String[] key = new String[line.length()];
      for (int i = 0; i < line.length(); i ++) {
        key[i] = line.charAt(i);
      }
      for (int i = 0; i < key.length; i++) {
        if (key[i] == 'U') {
          if (!(input < 3)) {
            keys -= 3;
          }
        }
        if (key[i] == 'L') {
          if (!(input < 3)) {
            keys -= 3;
          }
        }
      }
    }
    int x=0,y=0,dir=0;
    int[][] offset = {{0,1},{1,0},{0,-1},{-1,0}};
    for (int i = 0; i < data.length; i++) {
      if (data[i].charAt(0) == 'R') {
        dir ++;
      }
      else {
        dir --;
      }
      int steps = Integer.parseInt(data[i].substring(1));
      dir = (dir + 4) % 4;
      x = offset[dir][0] * steps;
      y = offset[dir][1] * steps;
    }
    return 0;
  }
}
