import java.util.*;
public class simintrest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter p:");
    double p = sc.nextInt();
    System.out.print("enter r:");
    double r = sc.nextInt();
    System.out.print("enter t:");
    double t = sc.nextInt();
    double simpleintrest = (p*r*t)/100.0;
    System.out.println("simple intrest is:"+ simpleintrest);
  }
}
