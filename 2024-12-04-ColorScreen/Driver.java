public class Driver {
  public static void main (String[] args) {
    border(80,30);
  }
  public static void border (int width, int height) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    Text.color (Text.RED, Text.background(Text.CYAN));
    for (int i = 1; i <= width; i ++) {
      Text.go(1,i);
      System.out.println(" ");
    }
    for (int i = 1; i <= width; i++) {
      Text.go(height, i);
      System.out.println(" ");
    }
    for (int j = 2; j < height; j ++) {
      Text.go(j, 1);
      System.out.print(" ");
      Text.go(j, width);
      System.out.println(" ");
    }
    Text.go(height+1,1);
    System.out.print(Text.RESET);
  }
}
