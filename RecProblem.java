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

  
    public static void main(String[] args) {
    //System.out.println(tilingProblem(4));
    String str = "apnacollege";
    removeDuplicates(str, 0, new StringBuilder(""), new boolean[26], new boolean[26]);

  }
}
