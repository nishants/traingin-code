public class FindMinimumInSorted {
  public static double minimumIn(double... array) {
    if(array.length==1)
      return array[0];
    for(int  i= 0; i< array.length-1;i++){
      if(array[i+1]<array[i])
        return array[i+1];
    }
    return array[0];
  }
}
