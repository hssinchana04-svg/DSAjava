public class RecProblem {
  public static int tilingProblem(int n){
    //basecase
    if(n==0 || n==1){
      return 1;
    }

    //vertical
    int fnm1 = tilingProblem(n-1);

    //horizontal
    int fnm2 = tilingProblem(n-2);

    int totalWays = fnm1 + fnm2;
    return totalWays;
  }

    //removing duplicates
    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
      if(idx == str.length()){
        System.out.println(newStr);
        return;
      }
      char currChar = str.charAt(idx);
      if(map[currChar-'a'] == true){
        //duplicatr
        removeDuplicates(str, idx+1, newStr, map);

      }else{
        map[currChar-'a'] = true;
        removeDuplicates(str, idx+1, newStr.append(currChar), map);
      }
    }

    public static int friendsPairing(int n){
      if(n == 1 || n == 2){
        return n;
      }

      //single
      // int fnm1 = friendsPairing(n-1);

      // //pair
      // int fnm2 = friendsPairing(n-2);
      // int pairWays = (n-1)*fnm2;

      // int totWays = fnm1 + pairWays;

      // return totWays;

      return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);

    }

    public static void printBinString(int n, int lastPlace, String str){
      //base case
      if(n == 0 ){
        System.out.println(str);
        return;
      }
      //kaam
      // if(lastPlace == 0){
      //   //sit 0 on chair n
      //   printBinString(n-1, 0, str.append("0"));
      //   printBinString(n-1, 1, str.append("1"));
      // }else{
        printBinString(n-1, 0, str+0);
        if(lastPlace == 0){
          printBinString(n-1, 1, str+1);
        }
      }
    

  
    public static void main(String[] args) {
    //System.out.println(tilingProblem(4));
    //String str = "apnacollege";
    //removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    //System.out.println(friendsPairing(3));

    printBinString(3, 0, "");
  }
}
