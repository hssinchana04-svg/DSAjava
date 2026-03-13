public class Recursion {
 
  public static void printDec(int n){
    if(n == 1){
      System.out.print(1);
      return;
    }
    System.out.print(n + " ");
    printDec(n-1);
  }

  public static void printInc(int n){
    if(n==1){
      System.out.println(n+" ");
      return;
    }
    printInc(n-1);
    System.out.println(n+" ");
  }

  public static int fact(int n){
    if(n == 0){
      return 1;
    }
    int fnm1 = fact(n-1);
    int fn = n * fact(n-1);
    return fn;
  }

  public static int calcSum(int n){
    if( n == 1){
      return 1;
    }
    int Snm1  = calcSum(n-1);
    int Sn = n + Snm1;
    return Sn;

  }  

  public static int calcFib(int n){
    if(n == 0 || n == 1){
      return n;
    }
    int Fnm1 = calcFib(n-1);
    int Fnm2 = calcFib(n-2);
    int Fn =  Fnm1+Fnm2;
    return Fn;
  }
  public static void main(String[] args) {
    int n = 5;
    // printDec(n);
    // printInc(n);
    // System.out.println(fact(n));
    // System.out.println(calcSum(n));
    System.out.println(calcFib(n));
  }
}
