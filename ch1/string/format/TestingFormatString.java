package string.format;


public class TestingFormatString {
  public static void main(String[] args) {
    System.out.println("Without a format string");
    System.out.println(1000.0 / 3.0);

    System.out.printf("This is a formated string: %s, and a number: %,.2f.\n",
        "test string", 1000.0 * 500 / 3.0);
    System.exit(0);
  }
}
