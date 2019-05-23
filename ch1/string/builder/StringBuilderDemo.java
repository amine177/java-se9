package string.builder;




public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder builder = new StringBuilder();
    builder.append("first");
    builder.append("second");
    builder.append("third");
    String result = builder.toString();
    System.out.println(result);
    System.exit(0);
  }
}
