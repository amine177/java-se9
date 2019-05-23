package string.api;

public class TestingStringAPI {
  public static void main(String[] args) {
    System.out.println("substring");
    String greeting = "Hello, World!";
    String location = greeting.substring(7, 12);
    System.out.println(location);
    System.out.println("--------------");

    System.out.println("equals");
    System.out.println("world".equals("World"));
    System.out.println("world".equalsIgnoreCase("World"));
    System.out.println("--------------");

  }
}
