package reading.input;

import java.util.Scanner;

public class TestScanner {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Hit me");
    String hit = in.nextLine();
    if (hit.equalsIgnoreCase("hit"))
      System.out.println("Ouch!!");
    else
      System.out.println("You were gentle!");
    System.exit(0);
  }
}
