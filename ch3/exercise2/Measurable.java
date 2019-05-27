package exercise2;

public interface Measurable {
  public double getMeasure();
  public abstract Measurable largest(Measurable[] objects);
}
