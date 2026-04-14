import java.util.*;

public class MDArraylist {
  // public static void storeWater(ArrayList<Integer> height){
  //   int maxWater = 0;
  //   //brute force approach O(n^2)
  //   for(int i=0; i<height.size(); i++){
  //     for(int j=i+1; j<height.size(); j++){
  //       int width = j - i;
  //       int ht = Math.min(height.get(i), height.get(j));
  //       int water = width * ht;
  //       maxWater = Math.max(maxWater, water);
  //     }
  //   }
  //   System.out.println(maxWater);
  // }


  //2 pointer approach O(n)

  public static void storeWater(ArrayList<Integer> height){
    int maxWater = 0;
    int lp = 0;
    int rp = height.size() - 1;

    while(lp < rp){
      int width = rp - lp;
      int ht = Math.min(height.get(lp), height.get(rp));
      int water = width * ht;
      maxWater = Math.max(maxWater, water);

      if(height.get(lp) < height.get(rp)){
        lp++;
      } else {
        rp--;
      }
    }
    System.out.println(maxWater);
  }
  public static void main(String[] args) {
    // ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    // ArrayList<Integer> list1 = new ArrayList<>();
    // ArrayList<Integer> list2 = new ArrayList<>();
    // ArrayList<Integer> list3 = new ArrayList<>();
    
    // for(int i=1; i<5; i++){
    //   list1.add(i*1);
    //   list2.add(i*2);
    //   list3.add(i*3);

    // }
    // mainList.add(list1);
    // mainList.add(list2);
    // mainList.add(list3);

    // System.out.println(mainList);

    ArrayList<Integer> height = new ArrayList<>();
    height.add(1);
    height.add(8);
    height.add(6);
    height.add(2);
    height.add(5);
    height.add(4);
    height.add(8);
    height.add(3); 
    height.add(7);

    storeWater(height);
  }
}
