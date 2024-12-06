public class Driver {
  public static void main (String[] args) {
    Adventurer p1 = new Wizard ("Jerry", 50);
    Adventurer p2 = new Wizard ("Isaac", 40);
    System.out.println(p1);
    System.out.println(p1.getName());
    System.out.println(p1.getSpecial());
    System.out.println(p1.getHP());
    System.out.println(p1.attack(p2));
  }
}
