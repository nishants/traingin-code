import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class CircularPrimeTest {

  private CircularPrime generator;

  @Test
  public void shouldReturnNextCircularPrimeNumber(){
    assertThat(CircularPrime.forDigits(1).first(), is(2));
    assertThat(CircularPrime.forDigits(2).first(), is(11));
    assertThat(CircularPrime.forDigits(3).first(), is(113));
    assertThat(CircularPrime.forDigits(4).first(), is(1193));
    assertThat(CircularPrime.forDigits(5).first(), is(11939));
  }

}