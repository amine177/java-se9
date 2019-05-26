

import java.util.Scanner;

public class Exercise9 implements Runnable {
  int n;
  String name;

  public Exercise9(String name, int n) {
    this.n = n;
    this.name = name;
  }
  public void run() {
    System.out.println("Executing " + name);
    for (int i = 0; i < n; i++)
      System.out.println("hello");
  }


  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("n=");
    int n = in.nextInt();
    Exercise9 e1 = new Exercise9("e1", n);
    Exercise9 e2 = new Exercise9("e2", n);
    new Thread(e1).run();
    new Thread(e2).run();

    System.exit(0);
  }
}
