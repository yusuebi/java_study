public class SuperHero extends Hero {
  public void attack(Matango m) {
    super.attack(m);
    if(this.flying){
      super.attack(m);
    }
  }
}
