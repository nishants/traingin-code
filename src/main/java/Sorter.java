public class Sorter {

  //Sorts the input array
  public int[] sort(int[] array) {
    if (array == null || isSorted(array) || array.length <= 1) {
      return array;
    }

    return sorted(array);
  }

  private boolean isSorted(int[] array) {
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[i - 1]) {
        return false;
      }
    }
    return true;
  }

  private int[] sorted(int[] array) {
    int temp;
    for (int i = 2; i <= array.length; i++) {
      for (int j = 0; j <= array.length - i; j++) {
        if (array[j] > array[j + 1]) {
          temp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = temp;
        }
      }
    }
    return array;
  }
}






