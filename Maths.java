// // Topics -> Math, String, Simulation

// import java.util.Scanner;

// public class Maths {
//     public static String fractionAddition(String expr){
//         int num = 0;
//         int deno = 1;

//         int i=0;
//         int n = expr.length();
//         while(i<n){
//             int currNum = 0;
//             int currDeno = 0;

//             boolean isNeg = (expr.charAt(i)=='-');

//             // skip + or -
//             if(expr.charAt(i)=='+' || expr.charAt(i)=='-'){
//                 i++;
//             }

//             // Build the current numerator
//             while(i < n && Character.isDigit(expr.charAt(i))){
//                 int val = expr.charAt(i) - '0';
//                 currNum = (currNum * 10) + val;
//                 i++;
//             }
//             i++; // skip the division character '/'

//             if(isNeg==true){ // Apply negative sign if needed
//                 currNum = currNum *-1;
//             }
//             // Build the current denominator
//             while(i < n && Character.isDigit(expr.charAt(i))){
//                 int val = expr.charAt(i) - '0';
//                 currDeno = (currDeno * 10) + val;
//                 i++;
//             }

//             // Update the accumlated numerator and denominator
//             num = num * currDeno + currNum * deno;
//             deno = deno * currDeno;
//         }
//         // Simplify the fraction using the GCD
//         int gcd = gcd(Math.abs(num), deno);
//         num = num /gcd;
//         deno = deno/gcd;

//         return num + "/" + deno;
//     }
//     private static int gcd(int a, int b){
//         if(b==0){
//             return a;
//         }
//         return gcd(b, a%b);
//     }

//     public static void main(String args[]){
//         // String expr = "-1/2+1/2";
//         // System.out.println("Final output " + expr + " = " + fractionAddition(expr));

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter new String expression : ");

//         String expr = sc.nextLine();
//         String res = fractionAddition(expr);

//         System.out.println("Final output : " + expr + " = " + res);
//         sc.close();
//     }
// }




// Fizz Buzz Problem

// import java.util.List;
// import java.util.Scanner;
// import java.util.ArrayList;
// public class Maths{
//     public static List<String> fizzBuzz(int n){
//         List<String> res = new ArrayList<>();

//         for(int i=0;i<=n;i++){
//             if(i%3==0 && i%5==0){
//                 res.add("FizzBuzz");
//             }
//             else if(i%3==0){
//                 res.add("Fizz");
//             }
//             else if(i%5==0){
//                 res.add("Buzz");
//             }
//             else{
//                 res.add(Integer.toString(i));
//             }
//         }
//         return res;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();

//         List<String> list = fizzBuzz(n);

//         // for(String s : list){
//         //     System.out.println("Ans : " + s);
//         // }
//         System.out.print(list);
//         sc.close();
//    }
//}

// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;
// public class Maths{
//     public static List<Integer> spiralOrder(int[][] matrix){
//         List<Integer> list = new ArrayList<>();

//         if(matrix == null || matrix.length==0){
//             return list;
//         }
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length-1;
//         int endCol = matrix[0].length-1;

//         while(startRow <= endRow && startCol <= endCol){
//             // Traverse from left to right on top row
//             for(int j=startCol; j<=endCol; j++){
//                 list.add(matrix[startRow][j]);
//             }
//             // Traverse from top to bottom on right column
//             for(int i=startRow+1; i<=endRow; i++){
//                 list.add(matrix[i][endCol]);
//             }
//             // Traverse from right to left on bottom row
//             for(int j=endCol-1; j>=startCol; j--){
//                 if(startRow==endRow){
//                     break;
//                 }
//                 list.add(matrix[endRow][j]);
//             }
//             // Traverse from bottom to top on left column
//             for(int i=endRow-1; i>=startRow;i--){
//                 if(startCol==endCol){
//                     break;
//                 }
//                 list.add(matrix[i][startCol]);
//             }
//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//         return list;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows : ");
//         int r = sc.nextInt();

//         System.out.print("Enter the number of columns : ");
//         int c = sc.nextInt();

//         int matrix[][] = new int[r][c];

//         System.out.println("Enter the matrix element : ");
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         List<Integer> res = spiralOrder(matrix);
//         System.out.println("Spiral matrix order of the matrix is : " + res);
//         sc.close();
//     }
// }



// ----Question -> Remove the Duplicates & print the unique array size and print the unique elements ---//
// import java.util.Scanner;

// public class Maths{
//     public static int duplicate(int[] nums){
//         int j = 0;
//         for(int i=1;i<nums.length;i++){
//             // if numbers are equal then move i pointer 
//             if(nums[j]!=nums[i]){
//                 j++;
//                 nums[j] = nums[i];
//             }
//         }
//         return j + 1; // return the umique array Size 
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size : ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];
//         System.out.print("Enter the elements : ");
//         for(int i=0;i<n;i++){
//             arr[i] = sc.nextInt();
//         }
//         int size = duplicate(arr);
//         System.out.println("Size : " + size);

//         System.out.println("Unique array Elements : ");
//         for(int k=0;k<size;k++){
//             System.out.print(arr[k] + " ");
//         }
//         sc.close();
//     }
// }




// --- Square Root of the Integer ---//
// Using the Built in Library 
// import java.util.Scanner;

// public class Maths{
//     public static long root(long n){
//         if(n==0 || n==1){
//             return n;
//         }
//         n = (long)Math.sqrt(n);
//         return n;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the integer : ");
//         int n = sc.nextInt();

//         long sqroot = root(n);
//         System.out.println("Output : " + sqroot);
//         sc.close();
//    }
//}




// ---Method to calculate square root without using Math.sqrt()
// Use The Binary Search Approach
import java.util.Scanner;

public class Maths{
    public static long squareRoot(int num){
        if(num==1 || num==0){
            return num;
        }
        long start = 1;
        long end = num;
        long res = 0;

        while(start <= end){
            long mid = (start+end)/2;

            if(mid*mid == num){
                return mid;
            }

            // If mid*mid is less than num, discard the left half
            else if(mid*mid < num){
                start = mid + 1; 
                res = mid; // Keep track of the floor value
            }
            else{ // If mid*mid is greater than num, discard the right half
                end = mid -1 ;
            }
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer : ");

        int n = sc.nextInt();
        long sqrt = squareRoot(n);

        System.out.print("The square root of " + n + " is approximately : " + sqrt);
        sc.close();
    }
}