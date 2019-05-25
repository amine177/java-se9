package runnable;


public class TestRunnableLambdas {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      final int v = i;
      new Thread((Runnable)() -> { System.out.println(v);})
        .start();
    }
  }
}
