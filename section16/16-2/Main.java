import java.io.*;
public class Main {
  public static void main(String[] args) throws Exception {
    String filename = "c:\\test.txt";
    FileWriter fw = new FileWriter(filename);
    fw.writer('そ');
    fw.writer('れ');
    fw.close();
  }
}
