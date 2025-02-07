//Solid rectangle
/*
import java.util.*;
public class Patterns {
    public static void main (String args[]){
        //solid rectangle

        int n = 4; //rows
        int m = 5; //column
        
        //outer loop
        for(int i = 1; i<=n;i++){
            //inner loop
            for(int j =1; j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}*/

//Hollow Rectangle
/* 
import java.util.*;
public class Patterns{
    public static void main(String args[]){
        int n = 4;
        int m = 5;
        
        //Hollow Rectangle

        //outer loop--> rows
        for(int i =1; i<=n; i++){
            //inner loop--> columns    
            for(int j =1; j<=m; j++){
                //cell--> (i,j)
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}*/

//Half Pyramid
/* 
import java.util.*;
public class Patterns{
    public static void main(String args[]){

        int n=4;

        //outer loop-->rows
        for(int i=1;i<=n;i++){
            //inner loop-->column
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Inverted pyramid
/* 
import java.util.*;
public class Patterns{
    public static void main(String args[]){
        int n =4;
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//Iverted rotated half Pyramid
/* 
import java.util.*;
public class Patterns{
    public static void main(String args[]){
        int n =4;
        //outer loop
        for(int i =1;i<=n;i++){  
            //inner loop-->space
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            //inner loop-->column
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//half Pyramid with number

import java.util.*;

public class Patterns {
    public static void main(String args[]) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // column
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// Inverted Half Pyramid with numbers
/*
 * import java.util.*;
 * public class Patterns{
 * public static void main(String args[]){
 * int n =5;
 * //outer loop //1 need "="symbol in loop
 * //0 don't need "=" symbol in loop
 * for(int i=1; i<=n;i++){
 * //inner loop
 * for(int j=1;j<=n-i+1;j++){
 * System.out.print(j);
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// Floyd's Triangle
/*
 * import java.util.*;
 * public class Patterns{
 * public static void main(String args[]){
 * int n =5;
 * int number=1;
 * 
 * //outer loop
 * for(int i=1;i<=n;i++){
 * //inner loop
 * for(int j=1;j<=i;j++){
 * System.out.print(number+" ");
 * number++;
 * }
 * System.out.println();
 * }
 * }
 * }
 */

// 0-1 triangle pattern
/*
 * import java.util.*;
 * public class Patterns{
 * public static void main(String args[]){
 * int n=5;
 * 
 * //outer loop
 * for(int i=1;i<=n;i++){
 * //inner loop
 * for(int j=1;j<=i;j++){
 * int sum=i+j;
 * if(sum%2==0){
 * System.out.print("1");
 * }
 * else{
 * System.out.print("0");
 * }
 * }
 * System.out.println();
 * }
 * }
 * }
 */
