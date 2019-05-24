package branching.label;


public class LabelBreak {
  public static void main(String[] args) {
outer:
    while (true) {
      break outer;
    }
    System.out.println("I am after outer");
    System.exit(0);
  }
}
