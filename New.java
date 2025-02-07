/*public class New {
   public static void main(String args[]) {
      int number = 123;
      String str = Integer.toString(number);
      System.out.println(str.length());
      
      
   }
}
*/

/*public class New {
   public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
      
      
   }
} */

/*import java.util.*;
public class New{
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println(" Enter the radius ");
      float radius = sc.nextFloat();
      sc.close();
      System.out.println(" Area of the circle : " + 3.14*radius*radius );
   }
}*/
/* 
public class New {
   public static void main(String args[]) {

      int arr[] = { 34, 67, 88, 12 };

      int max = arr[0];

      for (int i = 0; i < arr.length; i++) { // current element
         if (arr[i] > max) {
            max = arr[i];
         }
      }
      System.out.println(" maximum element in array " + max);
   }
}*/
/* 
--Buy & sell stocks
public class New {
   public static int buyandSellStocks(int prices[]) {
      int buy_price = Integer.MAX_VALUE;
      int max_profit = 0;

      for (int i = 0; i < prices.length; i++) {
         if (prices[i] < buy_price) {
            buy_price = prices[i];
         } else {
            int profit = prices[i] - buy_price;
            max_profit = Math.max(max_profit, profit);
         }
      }
      return max_profit;
   }

   public static void main(String args[]) {
      int prices[] = { 7, 1, 5, 3, 6, 4 };
      System.out.println(buyandSellStocks(prices));
   }
}*/

/* 
import java.util.*;
import java.util.Arrays;

public class New {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int[] nums =new int[] { 7, 8, 9, 5 };
      Arrays.sort(nums);
      System.out.println(Arrays.toString(nums));
   }
}*/

//Smallest element in the array//


public class New{
   public static int getSmallest(int nums[]){
      int smallest = Integer.MAX_VALUE;

      for(int i=0;i<nums.length;i++){
         if(smallest>nums[i]){
            smallest = nums[i];
         }
      }
      return smallest;
   }
   public static void main(String args[]){
      int nums[] = {2,8,1,9,3};
      System.out.println("Smallest number : " + getSmallest(nums));
   } 
}