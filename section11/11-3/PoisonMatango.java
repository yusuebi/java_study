public class PoisonMatango extends Matango {
  private int poison = 5;
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  attack(Hero h) {
    super.attack(h);
    if(this.poison > 0) {
      System.out.println("さらに毒の胞子をばらまいた！");
      int dmg = h.getHp() / 5;
      h.setHp(h.getHp() - dmg);
      System.out.println(dmg + "ポイントのダメージをあたえた");
      this.poison --;
    }
  }
}
