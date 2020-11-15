public class Computer extends TangibleAsset {
  private String makeName;
  // コンストラクタ
  public Computer(String name, int price, String color, String makeName) {
    super(name, price, color);
    this.makeName = makeName;
  }
  //　getterメソッド
  public String getMakeName() {
    return this.makeName;
  }
}
