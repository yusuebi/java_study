public class Main {
  public static void main(String[] args) {
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    c[2] = new Thief();
    c[3] = new Wizard();
    c[4] = new WIzard();
    // 宿屋に泊まる
    for(Character ch : c) {
      ch.setHp(ch.getHp() + 50);
    }
  }
}
