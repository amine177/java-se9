package lambda;

import java.util.function.IntUnaryOperator;

public class ClosureTest {
  public static IntUnaryOperator multiplier(int i) {
    return (int arg) -> { return arg * i; };
  }
  public static void main(String[] args) {
    IntUnaryOperator multiplierTen = ClosureTest.multiplier(10);
    System.out.println(multiplierTen.applyAsInt(5));
    System.exit(0);
  }
}
