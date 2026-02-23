public class twodmatrix {

  public static void printSpiral(int matrix[][]){
    int startRow = 0;
    int StartCol = 0;
    int enRow = matrix.length-1;
    int enCol = matrix[0].length-1;

    while(startRow <= enRow && StartCol <= enCol){
      //top
      for(int j=StartCol; j<=enCol; j++){
        System.out.print(matrix[startRow][j] + " ");
      }
      //right
      for(int i=startRow+1; i<=enRow; i++){
        System.out.print(matrix[i][enCol] + " ");
      }
      //bottom
      for(int j=enCol-1; j>=StartCol; j--){
        if(startRow == enRow){
          break;
        }
        System.out.print(matrix[enRow][j] + " ");
      }
      //left
      for(int i=enRow-1; i>=startRow+1; i--){
        if(StartCol == enCol){
          break;
        }
        System.out.print(matrix[i][StartCol] + " ");
      }
      startRow++;
      StartCol++;
      enRow--;
      enCol--;
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int matrix[][]={
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}
    };
    printSpiral(matrix);
  }
}
