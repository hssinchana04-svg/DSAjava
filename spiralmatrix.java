// public class spiralmatrix {

//   public static void printSpiral(int matrix[][]){
//     int startRow = 0;
//     int startCol = 0;
//     int endRow = matrix.length-1;
//     int endCol = matrix[0].length-1;

//     while(startRow <= endRow && startCol <= endCol){
//       //top
//       for(int j=startCol; j<=endCol; j++){
//         System.out.println(matrix[startRow][j] + " ");
//       }

//       //right
//       for(int i=startRow+1; i<=endRow; i++){
//         System.out.println(matrix[i][endCol]+ " ");
//       }

//       //bottom
//       for(int j=endCol-1; j>=startCol; j++){
//         if(startRow == endRow){
//           break;
//         }
//         System.out.println(matrix[j][endCol]+ " ");
//       }

//       //left
//       for(int i=endRow-1; i>=startCol; i--){
//         if(startCol == endCol){
//           break;
//         }
//         System.out.println(matrix[i][startCol] + " ");
//       }

//       startCol++;
//       startRow++;
//       endCol--;
//       endRow--;

//     }
//     System.out.println();
//   }
//   public static void main(String[] args) {
//     int matrix[][] = {{1, 2, 3, 4},
//                       {5, 6, 7, 8},
//                       {9, 10, 11, 12},
//                       {13, 14, 15, 16}};

//     printSpiral(matrix);
    
    
//   }
// }


public class spiralmatrix {

    public static void printSpiral(int[][] matrix) {

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // left to right
            for (int i = left; i <= right; i++) {
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            if (top <= bottom) {
                // right to left
                for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if (left <= right) {
                // bottom to top
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static int diagonalSum(int matrix[][]){
      int sum = 0;

      for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[0].length; j++){
          if(i == j){
            sum += matrix[i][j];
          }
          if(i+j == matrix.length-1){
            sum += matrix[i][j];
          }
        }
    }    
    return sum;
  }

  public static boolean staircaseSearch(int matrix[][], int key){
    int row = 0, col = matrix[0].length-1;

    while(row < matrix.length && col >= 0){
      if(matrix[row][col] == key) {
        System.out.println("found key at (" + row + "," + col + ")");
        return true;
      }
      else if(key <matrix[row][col]){
        col--;
      }else{
        row++;
      }
    }

    System.out.println("key not found!");
    return false;
  }

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 39, 50},
            {32, 33, 39, 50}
        };

        int key = 33;
        staircaseSearch(matrix, key);
    }
}
