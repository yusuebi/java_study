import java.io.*;
public class Main {
  public static void main(String[] args) {
    try {
      FileWrite fw = new FileWrite("data.txt");
    }catch (IOException e) {
      System.out.println("エラーが発生しました。");
    }
  }
}
