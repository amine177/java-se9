package random.generator;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random generator = new Random();
    System.out.println(generator.nextInt());
    System.out.println(generator.nextInt());
    System.exit(0);
  }
}
