import java.io.File;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {
    File f = new File("main.txt");
    Scanner sc = new Scanner(f);

    while (sc.hasNextLine()) {
      String data = sc.nextLine();
      System.out.println(data);
    }

    sc.close();
  }
}
