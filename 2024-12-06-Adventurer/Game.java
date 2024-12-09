import java.util.Scanner;
public class Game {
  public static void main (String[] args) {
    Scanner userInput = new Scanner(System.in);
    boolean flag = true;
    while (flag) {
      System.out.println("Enter player name:");
      String userName = userInput.nextLine();
      Adventurer player = new Wizard(userName, 100);
      System.out.println("Enter enemy name:");
      String userName2 = userInput.nextLine();
      Adventurer enemy = new CodeWarrior(userName2, 100);
      System.out.println("Player: " + player.getName() +
        ", " + player.getHP() + "/" + player.getmaxHP() + " HP" +
        ", "  + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName() + " ");
        System.out.println("Enemy: " + enemy.getName() +
          ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP" +
          ", "  + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      String user = userInput.nextLine();
      if (user.equalsTo("quit")) {
        return;
      }
    }
  }
}
