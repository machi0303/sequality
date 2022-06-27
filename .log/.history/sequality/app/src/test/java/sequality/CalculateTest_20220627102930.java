package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2.0, 3.0));
  }

  @Test
  public void testOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.odd(1, 10));
  }

  @Test
  public void testEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.even(1, 10));
  }
}
