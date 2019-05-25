package runnable;

class HelloTask implements Runnable {
  String taskName;
  public HelloTask(String taskName) {
    this.taskName = taskName;
  }
  public void run() {
    System.out.println("This is probably threaded");
    System.out.println(this.taskName);
    if (taskName.contains("2"))
        for (int j = 0; j < 100000000; j++);
    for (int i = 0; i < 2; i++) {
      System.out.println("Hello, World!");
    }
  }
}
