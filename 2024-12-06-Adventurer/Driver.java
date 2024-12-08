public class Driver {
  public static void main (String[] args) {
    Adventurer p1 = new Wizard ("Amy", 50);
    Adventurer p2 = new Wizard ("Isaac", 40);
    System.out.println("Wizard 1 name: " + p1);
    System.out.println("Wizard 1 name: " + p1.getName());
    System.out.println("Wizard 2 name: "+ p1);
    System.out.println("Wizard 2 name: "+ p2.getName());
    System.out.println("Wizard 1 HP: "+p1.getHP());
    System.out.println("Wizard 2 HP: "+p2.getHP());
    System.out.println(p1.attack(p2));
    System.out.println("Isaac's HP: " + p2.getHP());
    System.out.println(p2.specialAttack(p1));
    System.out.println("Amy's HP: " + p1.getHP());
    System.out.println("Amy's Special " + p1.getSpecialName() +": " + p1.getSpecial());
    System.out.println(p1.support());
    System.out.println(p1.support(p2));
    System.out.println("Amy's HP: " + p1.getHP());
    System.out.println("Amy's Special " +  p1.getSpecialName() +": " + p1.getSpecial());
    System.out.println("Isaac's HP: " + p2.getHP());
    System.out.println("Isaac's Special " + p2.getSpecialName() +": " + p2.getSpecial());
  }
}
