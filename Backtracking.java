/*
 * (1).All possible arrangement of "ABC" ||total permutation = n! . Print all
 * permutation.
 * Time complexity = O(n*n!)
 */
// Note ==> Backtracking -->Find all possible solutions & use the one you want//


//1).Backtracking for Array
/* 
public class Backtracking{
    public static void changeArray(int[] nums, int i, int value){
        //base case
        if(i == nums.length){
            printArray(nums);
            return;
        }
        //recursion step
        nums[i] = value;
        changeArray(nums, i+1, value+1);
        nums[i] = nums[i] - 2;
    }
    public static void printArray(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int nums[] = new int[5];
        changeArray(nums, 0, 1);
        printArray(nums);
    }
}
*/

//2).Find and print all subsets of a given string (All combination)
/* 
public class Backtracking{
    public static void findSubsets(String str, String ans, int i){
        //base case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        //recursion step

        //Yes choice 
        findSubsets(str, ans+str.charAt(i), i+1);
        //No choice 
        findSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str = "abc";
        findSubsets(str,"",0);
    }
}*/

//3).Find and print all permutations of a string

public class Backtracking{
    //Time Complexity = O(n * n!)
    public static void findPermutation(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion step
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //"abcde" = "ab" + "de" = "abde"
            //remove char(i) from string
            String newStr = str.substring(0, i) + str.substring(i+1); //'i' char not included(exclusive) 
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        findPermutation(str, "");
    }
}

//"abc" = abc, acb, bac, bca, cab, cba(All possible permutations)[n! or 3! = 3*2*1 = 6]

