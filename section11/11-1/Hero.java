public class Hero {
  private String name = "ミナト";
  private int hp = 100;
  //　戦う
  public void attack() {
    System.out.println(this.name + "の攻撃！");
    System.out.println("5ポイントのダメージを与えた！");
  }
  //　逃げる
  public void run() {
    System.out.println(this.name + "は逃げ出した！");
  }
}
