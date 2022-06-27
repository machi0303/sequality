package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int odd(int x, int y) {
    int odd;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1)
        odd += i;
    }
    return odd;
  }
}
