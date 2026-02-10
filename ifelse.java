import java.util.*;
public class ifelse {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter CP:");
    int cp = sc.nextInt();
    System.out.print("Enter SP:");
    int sp = sc.nextInt();

    if(sp > cp ){
      System.out.println("profit" + (sp-cp));
    }else if(sp == cp){
      System.out.println("no profit no loss");
    }
    else{
      System.out.println("loss" + (cp-sp));
    }
  }
}
