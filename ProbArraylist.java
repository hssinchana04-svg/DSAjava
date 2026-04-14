import java.util.ArrayList;

public class ProbArraylist {

  //brute force
  // public static void pairSum(ArrayList<Integer> list, int target){

  //   for(int i=0; i<list.size(); i++){
  //     for(int j=i+1; j<list.size(); j++){
  //       if(list.get(i) + list.get(j) == target){
  //         System.out.println("Pair found: " + list.get(i) + " and " + list.get(j));
  //         return;
  //       }
  //     }
  //   }
  //   System.out.println("Pair not found");
  // }

  public static void pairSum(ArrayList<Integer> list, int target){
    int lp = 0;
    int rp = list.size()-1;

    while(lp != rp){
      //case1
      if(list.get(lp) + list.get(rp) == target){
        System.out.println("Pair found: " + list.get(lp) + " and " + list.get(rp));
        return;
      }

      //case 2
      if(list.get(lp) + list.get(rp) < target){
        lp++;
      } else {
        rp--;
    }
  }
    System.out.println("Pair not found");

  }

  //pair sum 2
  public static void pairSum2(ArrayList<Integer> list, int target){
    int bp = -1;
    for(int i=0; i<list.size(); i++){
      if(list.get(i) > list.get(i+1)){
        bp = i;
        break;
      }
    }

    int lp = bp + 1; //smallest element
    int rp = bp; //largest element

    while(lp != rp){
      //case1
      if(list.get(lp) + list.get(rp) == target){
        System.out.println("Pair found: " + list.get(lp) + " and " + list.get(rp));
        return;
      }

      //case 2
      if(list.get(lp) + list.get(rp) < target){
        lp = (lp + 1) % list.size();
      } else {
        rp = (rp - 1 + list.size()) % list.size();
      }
    }
    System.out.println("Pair not found");
  }
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);  
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);

    int target = 16;

    pairSum2(list, target);

  }
}
