import java.util.*;
public class methods {
  public static void main(String[] args) {
    // System.out.println(Math.sqrt(4));
    // System.out.println(Math.sqrt(9));
    // System.out.println(Math.PI);
    // System.out.println(Math.abs(123));
    // System.out.println(Math.abs(-23));
    // greatest inetger -> floor
    // System.out.println(Math.floor(-7.8));
    // System.out.println(Math.ceil(3.0001));
    // System.out.println(Math.min(3,9));
    // System.out.println(Math.max(2.4, 56));
    System.out.println(Math.pow(-2.4, 5));
    

    Scanner sc = new Scanner(System.in);
    System.out.print("enter the num: ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println(Math.max(Math.max(a,b),c));
  }
}
