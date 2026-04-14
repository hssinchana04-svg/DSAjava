import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
  public static void swap(ArrayList<Integer> list, int idx1, int idx2){
    int temp = list.get(idx1);
    list.set(idx1, list.get(idx2));
    list.set(idx2, temp);
  }

  public static void main(String[] args) {
    //java collection framework
    ArrayList<Integer> list = new ArrayList<>();
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Boolean> list3 = new ArrayList<>();


    //add element
    list.add(2);
    list.add(5);
    list.add(9); //O(n)
    list.add(6);
    list.add(8);

    // list.add(2, 13);
    // System.out.println(list);

    // //get element
    // int element = list.get(2);
    // System.out.println(element);


    // //delete element
    // // int element2 = list.remove(1);
    // // System.err.println(element2);

    // list.remove(1);
    // System.out.println(list);

    // //set
    // list.set(1, 10);
    // System.out.println(list);

    // //contains
    // System.out.println(list.contains(1));
    // System.out.println(list.contains(12));

  //   System.out.println(list.size());

  //   for(int i=0; i<list.size(); i++){
  //     System.out.print(list.get(i) + " ");
  //   }
  //   System.out.println();
  // }

  //reverse order
//        for(int i=list.size()-1; i>=0; i--){
//         System.out.print(list.get(i) + " "); //O(n)
// }

//find maximum
  //   int max = Integer.MIN_VALUE; //O(n)
  //   for(int i=0; i<list.size(); i++){
  //   //   if(list.get(i) > max){
  //   //     max = list.get(i);
  //   //   }
  //   max = Math.max(max, list.get(i));
  // }
  //   System.out.println("Maximum element: " + max);

  //swap 2 nums
      //  int idx1 = 1, idx2 = 3;
      //  swap(list, idx1, idx2);
      //   System.out.println(list);

      System.out.println(list);
      Collections.sort(list); //ascending order
       System.out.println(list);

       //descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
}
}
