// Binary Search (only works on Sorted Arrays)
// Time Complexity -> O(log n)
// Space Complexity -> O(1)

//-----------Iterative Approach-------------------------------//

/*public class binarySearch {
    public static int bs(int arr[], int tar){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] < tar){
                start = mid + 1; // Search right half
            }else if(arr[mid] > tar){
                end = mid - 1; // Search left half
            }else{
                return mid; // Found target, return index
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {14, 18, 25, 30, 39, 67, 84};
        int target = 39;

        int res = bs(arr, target);
        System.out.println(res);
    }
}*/

// ---Note -> Iterative approach is better than Recursive approach because Iterative approach use less space than Recursive approach


//-------------------------Recursive Approach----------------------------------//
// Time Complexity -> O(log n)
// Space Complexity -> O(log n), recursive approach use the stack space

public class binarySearch{
    public static void main(String args[]){
        int arr[] = {5, 10, 30, 35, 40, 56, 77};
        int target = 56;

        System.out.println(bsRecursive(arr, target, 0, arr.length-1));
    }
    public static int bsRecursive(int nums[], int tar, int start, int end){
       
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] < tar){ // search right half (mid se agla)
                return bsRecursive(nums, tar, mid+1, end);
            }else if(nums[mid] > tar){ // search left half (mid se pichla)
                return bsRecursive(nums, tar, start, mid-1);
            }
            else{
                return mid; // Found target, return index
            }
        }
        return -1;
    }
}

