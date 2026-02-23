import java.util.*;
public class stringstring {
  public static void printLetters(String str){
    for(int i=0; i<str.length(); i++){
      System.out.print(str.charAt(i) + " ");
    }
    System.out.println();
  }
  public static boolean isPalindrome(String str){
    for(int i=0; i<str.length()/2; i++){
      int n = str.length();
      if(str.charAt(i) == str.charAt(n-1-i)){
        return false;
      }
    }
    return true;
  }

  public static float getShortestPath(String path){
    int x=0, y=0;

    for(int i=0; i<path.length(); i++){
      char dir = path.charAt(i);
      //south
      if(dir == 'S'){
        y--;
      }
      //north
      else if(dir == 'N'){
        y++;
      }
      //west
      else if(dir == 'W'){
        x--;
      }
      //south
      else {
        x++;
      }
    }
    int X2 = x*x;
    int Y2 = y*y;
    return (float)Math.sqrt(X2+Y2);
  }

    
  public static void main(String[] args) {
    // char arr[] = {'a', 'b', 'c', 'd', 'e'};
    // String str = "abcde";
    // String str2 = new String("xyz");
    // System.err.println(arr);


    // Scanner sc = new Scanner(System.in);
    // String name;
    // name = sc.nextLine();
    // System.out.println(name);

    // String fullname = "John Doe";
    // System.out.println(fullname.length());

    //concatenation
    // String firstName = "John";
    // String lastName = "Doe";
    // String fullName = firstName + " " + lastName;
    // System.out.println(fullName.charAt(0));
    // printLetters(fullName);

    //palindrome
    String str = "racecar";
    System.out.println(isPalindrome(str));

    //NEWS
    String path = "WNEENESENNN";
    System.out.println(getShortestPath(path));
  }
}
