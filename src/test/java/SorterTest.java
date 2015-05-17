import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;

public class SorterTest {

  @Test
  public void shouldReturnArrayIfSizeIsOne() {
    int[] array = new int[]{1};

    int[] sorted = new Sorter().sort(array);

    assertThat(sorted, is(array));
  }

  @Test
  public void shouldReturnArrayIfArrayIsEmpty() {
    int[] emptyArray = new int[]{};

    int[] returnedArray = new Sorter().sort(emptyArray);

    assertThat(returnedArray, is(emptyArray));
  }

  @Test
  public void shouldReturnArrayIfAlreadySorted() {
    int[] sortedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    int[] returnedArray = new Sorter().sort(sortedArray);

    assertThat(returnedArray, is(sortedArray));
  }

  @Test
  public void shouldReturnSortedArrayIfUnsorted() {
    int[] unsortedArray = new int[]{3, 1, 4, 2, 7, 9, 6, 5, 8};
    int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    int[] returnedArray = new Sorter().sort(unsortedArray);

    assertThat(returnedArray, is(expectedArray));
  }

  @Test
  public void shouldSortAReverseSortedArray() {
    int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};
    int[] returnedArray = new Sorter().sort(array);

    int[] expectedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    assertThat(returnedArray, is(expectedArray));
  }

  @Test
  public void shouldReturnNullIfArrayIsNull() {
    int[] returned = new Sorter().sort(null);

    assertThat(returned, is(nullValue()));
  }

  @Test
  public void shouldReturnArrayIfArrayIsSortedWithDuplicateElements() {
    int[] array = new int[]{1, 2, 2, 3, 4, 5, 5, 6};

    int[] returnedArray = new Sorter().sort(array);

    assertThat(returnedArray, is(array));
  }

  @Test
  public void shouldReturnSortedArrayIfUnsortedWithDuplicateElements() {
    int[] array = new int[]{3, 5, 6, 2, 2, 1, 4, 3, 7};
    int[] expectedArray = new int[]{1, 2, 2, 3, 3, 4, 5, 6, 7};

    int[] result = new Sorter().sort(array);

    assertThat(result, is(expectedArray));
  }
}