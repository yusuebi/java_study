public abstract class TangibleAsset extends Asset implement Thing {
  private String color;
  private double weight;
  public TangibleAsset(String name, int price, String color) {
    super(name, price);
    this.color = color;
  }
  public String getColor() {
    return this.color;
  }
  public String getWeight() {
    return this.getWeight;
  }
  public void setWeight(double weight) {
    this.weight = weight;
  }
}
