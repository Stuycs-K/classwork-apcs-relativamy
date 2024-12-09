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
    while (true) {
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      if (input.equals("a")) {
        System.out.println(player.attack(enemy));
      }
      else if (input.equals("sp")) {
        System.out.println(player.specialAttack(enemy));
      }
      else if (input.equals("su")) {
        System.out.println(player.support());
      }
      else if (input.equals("quit")) {
        return;
      }
      else {
        System.out.println("Incorrect input. Type: (a)ttack / (sp)ecial / (su)pport / quit");
      }
    }
  }
}
