public class Driver {
  public static void main (String[] args) {
    border(80,30,"-");
    Text.go(31,1);
    numbers();
    border(80,1,"*");
    System.out.println(Text.SHOW_CURSOR);
  }
  public static void border (int width, int height, String borderText) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.print(Text.HIDE_CURSOR);
    Text.color (Text.RED, Text.background(Text.CYAN));
    for (int i = 1; i <= width; i ++) {
      Text.go(1,i);
      System.out.println(borderText);
    }
    for (int i = 1; i <= width; i++) {
      Text.go(height, i);
      System.out.println(borderText);
    }
    for (int j = 2; j < height; j ++) {
      Text.go(j, 1);
      System.out.print(borderText);
      Text.go(j, width);
      System.out.println(borderText);
    }
  }
  public static void numbers() {
    int[] nums = new int[3];
    for (int i = 0; i < 3; i ++) {
      nums[i] = (int)(Math.random() * 100);
    }
    for (int num: nums) {
      if (num < 25) {
        Text.color(Text.RED, Text.background(Text.BLACK), Text.BRIGHT);
        System.out.print(num + " ");
      }
      else if (num > 75) {
        Text.color(Text.GREEN, Text.background(Text.BLACK), Text.BRIGHT);
        System.out.print(num + " ");
      }
      else {
        Text.color(Text.WHITE);
        System.out.print(num + " ");
      }
    }
  }
}
