import java.util.Scanner;
public class Game {
  public static void main (String[] args) {
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter player name: ");
    String userName = userInput.nextLine();
    Adventurer player = new Wizard(userName, 100);
    System.out.print("Enter enemy name: ");
    String userName2 = userInput.nextLine();
    Adventurer enemy = new CodeWarrior(userName2, 100);
    System.out.println("Player: " + player.getName() +
      ", " + player.getHP() + "/" + player.getmaxHP() + " HP" +
      ", "  + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName() + " ");
      System.out.println("Enemy: " + enemy.getName() +
        ", " + enemy.getHP() + "/" + enemy.getmaxHP() + " HP" +
        ", "  + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
    boolean flag = true;
    while (flag) {
      flag = check(player,enemy);
      if (flag && enemy.getHP() > 0) {
        System.out.print("Opponent is still alive!");
        flag = check(enemy,player);
      }
      if (enemy.getHP() < 0 || player.getHP() < 0) {
        System.out.println("GAME OVER!");
        return;
      }
    }
  }
  public static boolean check (Adventurer p1, Adventurer p2) {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    String input = userInput.nextLine();
    if (input.equals("a")) {
      System.out.println(p1.attack(p2));
    }
    else if (input.equals("sp")) {
      System.out.println(p1.specialAttack(p2));
    }
    else if (input.equals("su")) {
      System.out.println(p1.support());
    }
    else if (input.equals("quit")) {
      return false;
    }
    else {
      System.out.println("Incorrect input. Type: (a)ttack / (sp)ecial / (su)pport / quit");
    }
    return true;
  }
}
