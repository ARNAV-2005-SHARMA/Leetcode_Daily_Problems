//1). 
//Pattern   pyramid
/* 
import java.util.*;
public class Practice {
    public static void main(String args[]){
        int n=4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}*/

//2). Greatest common Divisor of 2 numbers(gcd or hcf)and lcm
// -->n1 = 9 & n2 = 18 || gcd = 9
/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number 2 ");
        int n2 = sc.nextInt();
        int gcd=1;
        for(int i =1; i<=n1;i++){
            if(n1%i==0 & n2%i==0){
                gcd=i;
         }
      }
          System.out.println("GCD is = "+ gcd);
          int lcm=1;
          lcm=(n1*n2)/gcd;
          System.out.println("Lcm is = "+ lcm);
    }
}*/

//3). print Fibonacci series
//0 1 1 2 3 5 8 13
/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the term :");
        int term = sc.nextInt();
        int c;
        int a =0;
        int b =1;
        for(int i =1;i<=term;i++){
            System.out.println(a+ " ");
            c=a+b;
            a=b;
            b=c;
        }
    }
} 
*/

//4). Count digits in number --->3456 || -->4 digits
/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any number ");
        int n = sc.nextInt();
        int count = 0;

        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("No of digits "+ count);
    }
}*/

//5).Reverse a number -->234 || -->432
/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        int r ;

        while (n>0){
            r=n%10;
            System.out.println(r);
            n=n/10;
        }
    }
}*/

//6).Palindrome Number -->121  / 121
/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number :");
        int n = sc.nextInt();
        int s=0;
        int c ,r;
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s){
            System.out.println("Palindrome Number");
        }
        else{
            System.out.println("Not palindrome Number");
        }
    }
}*/

//7).print armstrong number --> 153 = 1^3+5^3+3^3 ||1+125+27=153

/*import java.util.*;
public class Practice{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int arm=0 , rem , c;
        c=n;
        while(n>0){
            rem=n%10;
            arm=(rem*rem*rem)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong Number");
        }
    }
}*/

//(8). Reverse an array --> {1,3,56} = {56,3,1}
//-Input from the user

/*import java.util.*;

public class Practice {
    public static void main(String args[]) {

        int arr[] = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(" array elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(" \n array reverse elements ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}*/

//--9).Reverse an array
/* 
public class Practice {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[] { 1, 8, 6, 3, 5 };
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        // Loop through the array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}*/

//-10).Array element in Ascending order
/* 
import java.util.*;

public class Practice {
    public static void main(String args[]) {
        int nums[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in an array ");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j<5; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}*/

/*
Note --> For descending order nums[i] < nums[j] and use temp variable
*/



//--11).Diagonal Sum of the matrix

/* 
public class Practice{
    public static int diagonalSum(int matrix[][]){
        //Brute Force Solution
        //Time Complexity = O(n^2)
         
        int sum = 0;

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                    sum = sum + matrix[i][j];
                }
                else if(i+j ==matrix.length-1){
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},{5, 6, 7, 8},{9, 10, 11, 12},{13, 14, 15, 16}};
        System.out.print(diagonalSum(matrix));
    }
}*/


//-----------------------------------------------------------------------------//
//-----Optimal Solution for Diagonal sum of the matrix------//


//**Time Complexity = O(n)**//

/*public class Practice{
    public static int diagonalSum(int[][] matrix){
        int sum = 0;

        for(int i=0;i<matrix.length;i++){
            //primary diagonal
            //if i==j
            sum = sum + matrix[i][i];

            //Secondary diagonal
            //if i!=j
            //  i + j = n-1
            //  j = n-1-i
            if(i != matrix.length-1-i){
                sum = sum + matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print(diagonalSum(matrix));
    }
}*/

// 1 2 3
// 4 5 6
// 7 8 9

// Second Largest in Array
class Practice{
    public static void main(String args[]){
        int arr[] = {12};
        ArithmeticException

        if(second(arr)==Integer.MIN_VALUE){
            System.out.println("null");
        }
        else{
            System.out.println(second(arr));
        }
        
    }
    public static int second(int nums[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(nums.length < 2){
            return Integer.MIN_VALUE;
        }

        for(int n : nums){
            if(n > largest){
                secondLargest = largest;
                largest = n;
            }
            else if(n > secondLargest && n!=largest){
                secondLargest = n;
            }
        }
        // Student stu = new Student()
        return secondLargest;
    }
}  