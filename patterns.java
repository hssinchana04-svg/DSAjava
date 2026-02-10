//hallow_rectangle pattern

public class patterns {
  
  public static void hollow_rectangle(int rows, int cols){
    for(int i=1; i<=rows; i++){
      for(int j=1; j<=cols; j++){
        if(i==1 || i==rows || j==1 || j==cols){
          System.out.print("*");

        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

//inverted and rotated half pyramid pattern
  public static void inverted_rotated_half_pyramid(int n){
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      for(int k=1; k<=i; k++){
        System.out.print("*");
      }
      System.out.println();
    }
  }

  public static void inverted_half_pyramid_with_numbers(int n){
    for(int i=1; i<=n; i++){
      for(int j=1; j<=n-i+1; j++){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }

  public static void floyds_triangle(int n){
    int counter=1;
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        System.out.print(counter+" ");
        counter++;
      }
      System.out.println();
    }
  }

  public static void zero_one_triangle(int n){
    for(int i=1; i<=n; i++){
      for(int j=1; j<=i; j++){
        if( (i+j) % 2 == 0){
          System.out.print("1 ");
        }else{
          System.out.print("0 ");
        }
      }
      System.out.println();
    }
  }

  public static void butterfly_pattern(int n){
    //1st half
    for(int i=1; i<=n; i++){
      //star - i
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      //spaces - 2*(n-i)
      for(int j=1; j<=2*(n-i); j++){
        System.out.print(" ");
      }
      //star - i
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    //2nd half
    for(int i=n; i>=1; i--){
      //star - i
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      //spaces - 2*(n-i)
      for(int j=1; j<=2*(n-i); j++){
        System.out.print(" ");
      }
      //star - i
      for(int j=1; j<=i; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }

  public static void solid_rhombus(int n){
    for(int i=1; i<=n; i++){
      //spaces
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //stars
      for(int j=1; j<=n; j++){
        System.out.print("*");
      }
      System.out.println();
    }
    
  }

  public static void hollow_rhombus(int n){
    for(int i=1; i<=n; i++){
      //spaces
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //hollow rectangle -stars
      for(int j=1; j<=n; j++){
        if(i==1 || i==n || j==1 || j==n){
          System.out.print("*");
        }else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }

  public static void solid_diamond(int n){
    //1st half
    for(int i=1; i<=n; i++){
      //spaces
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //stars
      for(int j=1; j<=(2*i)-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    //2nd half
    for(int i=n; i>=1; i--){
      //spaces
      for(int j=1; j<=n-i; j++){
        System.out.print(" ");
      }
      //stars
      for(int j=1; j<=(2*i)-1; j++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    // hollow_rectangle(4,5);
    //inverted_rotated_half_pyramid(5);
    //inverted_half_pyramid_with_numbers(5);
    //floyds_triangle(5);
    //zero_one_triangle(5);
    //butterfly_pattern(4);
    //solid_rhombus(5);
    //hollow_rhombus(5);
    solid_diamond(4);
  }
}



