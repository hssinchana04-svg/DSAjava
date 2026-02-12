import java.util.*;

public class inbulitsort {
  public static void printArr(Integer arr[]){
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }

  public static int compare(Integer a, Integer b){
    return b.compareTo(a);
  }
  public static void main(String[] args) {
    Integer arr[] = {5, 4, 1, 3, 2};
    Arrays.sort(arr, Collections.reverseOrder());
    printArr(arr);
    compare(5, 4);
  }
}
