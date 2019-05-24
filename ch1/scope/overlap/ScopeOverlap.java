package scope.overlap;

import java.util.Scanner;

public class ScopeOverlap {
  public static void main(String[] args) {
    int i;
    Scanner in = new Scanner(System.in);
    {
      String i = in.next();
    }

    System.exit(0);
  }
}
