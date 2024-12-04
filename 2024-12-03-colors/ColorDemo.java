import java.util.Random;

public class ColorDemo {
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";
  public static int BLACK = 30;
  public static int RED = 31;

  public static void color(int foreground,int background){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + "m");
  }

  public static void color(int foreground, int background, int modifier){
    System.out.print( "\u001b[" + foreground + ";" + (10+background) + ";" + modifier + "m");
  }

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

  public static void main(String[] args) {
    System.out.print(CLEAR_SCREEN + HIDE_CURSOR);
    color(RED, BLACK);
    System.out.println("red text on a black background.");
    color(RED, BLACK, 1);
    System.out.println("bold red text on a black background.");
    System.out.print("\u001b[0m");
    System.out.println("normal text");
    go(10, 5);
    color(RED, BLACK);
    System.out.print("moved text");
    loopRGB(20);
    System.out.print(SHOW_CURSOR);
  }

  public static String randomRGB() {
    Random random = new Random();
    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);
    return "\u001b[38;2;" + red + ";" + green + ";" + blue + "m";
  }

  public static void loopRGB(int n) {
    for (int i = 0; i < n; i ++) {
     System.out.print(randomRGB());
     System.out.print("changed color");
    }
  }
}

