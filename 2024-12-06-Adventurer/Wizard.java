import java.util.Random;
public abstract class Wizard extends Adventurer {
  private int special = 0;
  public Wizard (String name) {
    super(name);
  }
  public Wizard (String name, int hp) {
    super(name, hp);
  }
  public String getSpecialName() {
    return "mana";
  }
  public int getSpecial() {
    return special;
  }
  public void setSpecial(int n) {
    special = n;
  }
  public int getSpecialMax() {
    return 100;
  }
  public String attack (Adventurer other) {
    other.applyDamage(10);
    return "damaged " + other.getName() + " by 10 hp";
  }
  public String support (Adventurer other) {
    other.setHP(other.getHP() + 10);
    return "supported " + other.getName() + " by 10 hp";
  }
  public String specialAttack (Adventurer other) {
    other.setSpecial(other.getSpecial() - 15);
    other.applyDamage(20);
    return "special attack! damaged " + other.getName() + " -15 special and -20 HP";
  }
}
