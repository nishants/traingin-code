import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


public class FindMinimumInSortedTest {
  @Test
  public void shouldFindTheMinimumInRotatedSortedArray() {
    assertThat(FindMinimumInSorted.minimumIn(1.0, 3.0, 6.0, 9.0, 12.0, 15.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(15.0, 1.0, 3.0, 6.0, 9.0, 12.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(12.0, 15.0, 1.0, 3.0, 6.0, 9.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(9.0, 12.0, 15.0, 1.0, 3.0, 6.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(6.0, 9.0, 12.0, 15.0, 1.0, 3.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(3.0, 6.0, 9.0, 12.0, 15.0, 1.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(1.0),is(1.0) );

    assertThat(FindMinimumInSorted.minimumIn(1.0, 2.0, 3.0, 6.0, 9.0, 12.0, 15.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(15.0, 1.0, 2.0, 3.0, 6.0, 9.0, 12.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(12.0, 15.0, 1.0, 2.0, 3.0, 6.0, 9.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(9.0, 12.0, 15.0, 1.0, 2.0, 3.0, 6.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(6.0, 9.0, 12.0, 15.0, 1.0, 2.0, 3.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(3.0, 6.0, 9.0, 12.0, 15.0, 1.0, 2.0), is(1.0));
    assertThat(FindMinimumInSorted.minimumIn(2.0, 3.0, 6.0, 9.0, 12.0, 15.0, 1.0), is(1.0));
  }

}