package runnable;

public class TestRunnableTasks {
  public static void main(String args[]) {
    for (int i = 0; i < 5; i++) {
      Runnable task = new HelloTask("Task" + Integer.toString(i));
      Thread thread = new Thread(task);
      thread.start();
    }
  }
}
