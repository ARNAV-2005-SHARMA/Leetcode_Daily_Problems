//-1).Max subArray Sum
//--By using brute force approach--//
//.Time Complexity = O(n^3)
/* 
public class Arrays2 {
    public static void maxSubArray(int nums[]){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                currSum = 0;
                for(int k=start;k<=end;k++){
                    //sub array sum
                    currSum = currSum + nums[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        maxSubArray(nums);
    }
}*/



//2).Max SubArray Sum
//--By using Prefix sum--//
//.Time Complexity = O(n^2)

/*public class Arrays2{
    public static void maxSubarraySum(int nums[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;
        int prefix[] = new int[n];

        prefix[0] = nums[0];
        //calculte prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i=0; i<n;i++){
            int start = i;
            for(int j=i;j<n;j++){
                int end = j;
                
                if(start==0){
                    currSum = prefix[end];
                }
                else{
                    currSum = prefix[end] - prefix[start-1]; //Main Formula
                }
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum : " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {1, -2, 6, -1, 3};
        maxSubarraySum(nums);
    }
}*/


//-3).Max SubArray Sum
//**By Using Kadane's Algorithm**/
//.Time Complexity = O(n)


/*public class Arrays2{
    public static void Kadanes(int nums[]){
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0;i<n;i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }
            else{
                maxSum = Math.max(currSum, maxSum);
            }
        }
        System.out.println("Our max subarray Sum : " + maxSum);
    }
    public static void main(String args[]){
        int nums[] = {-2, -3, 4, -1, -2, -1, -5, -3};
        Kadanes(nums);
    }
}*/

//-4).Trapped Rain Water
//Time Complexity = O(n)

//import java.util.Arrays;

// public class Arrays2{
//     public static int trappedRainWater(int height[]){
//         int n = height.length;
//         //Calculate left max boundary - array
//         int leftMax[] = new int[n];
//         leftMax[0]  = height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//         }

//         //calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n-1] = height[n-1];
//         for(int i=n-2; i>=0; i--){
//             rightMax[i] = Math.max(height[i], rightMax[i+1]);
//         }

//         //loop
//         int trappedWater = 0;
//         for(int i=0;i<n;i++){
//             //waterLevel = min(leftMax bound, rightMax bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             //trapped water = waterLevel - height[i]
//             trappedWater = trappedWater + waterLevel - height[i];
//         }
//         return trappedWater;
//     }
//     public static void main(String args[]){
//         int height[] = {4, 2, 0, 6, 3, 2, 5};
//         System.out.println(trappedRainWater(height));
//     }
// }


//---Remove Duplicates from Array and Print Unique Array & size of unique array
public class Arrays2{
    public static int unique(int[] nums){
    
        int j = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++; 
                nums[j] = nums[i];
            }
        }
        return j+1; // Size of the Unique Array
    }
    public static void main(String args[]){
        int[] a = {1, 2, 2}; // 1, 2, 3, 4, 5
        int res = unique(a);
        System.out.println(res);
        for(int i=0;i<res;i++){
            System.out.print(a[i] + " "); // Unique elements printed correctly
        }
    }
}