import java.util.*;
public class conditions {
  public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.print("Enter num: ");
    // int n = sc.nextInt();
    // if(n >= 0){
    //   System.out.println(n);
    // }else{
    //   n = -n;
    // }
    //   System.out.println(n);

    double n = sc.nextInt();
    double x = (int)n;
    if(n-x == 0){
      System.out.println("It is an integer");
    }else{
      System.out.println("it is not an interger");
    }
    }
  }

