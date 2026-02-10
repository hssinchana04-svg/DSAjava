// import java.util.*;

// public class MaxSum{
//   int currSum;
//   int maxSum = Integer.MIN_VALUE;

// public static void maxSubbArray(int numbers[]){

//     for(int i=0; i<numbers.length; i++){
//         int start = i;
        
//         for(int j=i; j<numbers.length; j++){
//           int end = j;
//           currSum = 0;
//           for(int k=start; k<=end; k++){
//             currSum += numbers[k];
            
//           }
//           System.out.println(currSum);
//           if(maxSum < currSum){
//             maxSum = currSum;
//           }
//         }
        
//     } 
//     System.out.println("max sum=" + maxSum);
//   }
//   public static void main(String[] args) {
//     int numbers[] = {2, 4, 6, 8, 10};

//     maxSubbArray(numbers);
//   }
// }

// import java.util.*;

// public class MaxSum {

//     public static void maxSubbArray(int numbers[]) {
//         int maxSum = Integer.MIN_VALUE; // declare maxSum
//         int currSum;            
//         int prefix[] = new int[numbers.length];        

//         prefix[0] = numbers[0];
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
//         }
//         for(int i=0; i<numbers.length; i++){
//           int start = i;
//             for (int j = i; j < numbers.length; j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];


//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//     }

//     public static void kadanes(int numbers[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++){
//             cs = cs+numbers[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("our maximum subarray sum is: " + ms);
//     }

//     public static void main(String[] args) {
//         int numbers[] = {-2, -3 , 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);


//         maxSubbArray(numbers);
//     }
// }

  


import java.util.*;

public class MaxSum {
    public static int buyAndSellStocks(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit =  Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }

        return  maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println(buyAndSellStocks(prices));
    }
}