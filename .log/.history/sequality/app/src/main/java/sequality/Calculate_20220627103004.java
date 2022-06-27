package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    return (double) (x + y) / 2;
  }

  public int odd(int x, int y) {
    int odd = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 1)
        odd += i;
    }
    return odd;
  }

  public int even(int x, int y) {
    int even = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0)
        even += i;
    }
    return even;
  }
}
