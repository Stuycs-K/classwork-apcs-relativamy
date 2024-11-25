import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import javax.sound.sampled.Line;
import java.util.Arrays;

public class day1 {
  public static void main(String[] args){
    //System.out.println(Arrays.toString(parse("day1.txt")));
    System.out.println(solve(parse("day1.txt")));
  }
  public static String[] parse(String filename){
    try {
      File file = new File (filename);
      Scanner info = new Scanner (file);
      String line = info.nextLine();
      return line.split(", ");
    } catch (FileNotFoundException e) {
      return new String[0];
    }
  }

  public static int solve (String[] data) {
    int x=0,y=0,dir=0;
    int[][] offset = {{0,1},{1,0},{0,-1},{-1,0}};
    ArrayList<String> visited = new ArrayList<>();
    visited.add("0,0");
    for (int i = 0; i < data.length; i++) {
      if (data[i].charAt(0) == 'R') {
        dir ++;
      }
      else {
        dir --;
      }
      int steps = Integer.parseInt(data[i].substring(1));
      dir = (dir + 4) % 4;
      for (int j = 0; j < steps; j ++) {
        x += offset[dir][0];
        y += offset[dir][1];
        String currentPos = x + "," + y;
        if (visited.contains(currentPos)) {
          return x+y;
        }
        visited.add(currentPos);
      }
    }
    return x+y;
  }
}
