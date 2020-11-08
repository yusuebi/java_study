import java.util.*;
public class Cleric {
  String name;
  int hp = 50;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;

  void selfAid() {
    System.out.println(this.name + "は、セルフエイドを唱えた！");
    this.mp -= 5;
    this.hp = this.MAX_HP;
    System.out.println("HPが最大まで回復した！");
  }
  void pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間天に祈った！");
    //乱数で回復量を決定する
    int recover = new Random().nextInt(3) + sec;
    //実際の回復量計算
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("MPが" + recoverActual + "回復した！");
    return recoverActual;
  }
}
