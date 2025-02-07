//Butterfly pattern
/* 
import java.util.*;
public class Patterns2 {
    public static void main(String args[]){
        int n=4;
        //Upper Half  [1 to n]
        for(int i=1;i<=n;i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower Half   [n to 1]

        for(int i=n;i>=1;i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            int spaces= 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd Part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }    
}*/

//Solid Rhombus 
/* 
import java.util.*;
public class Patterns2{
    public static void main(String args[]){
        int n = 4;
        //outer loop->rows
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //columns-->inner loop
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/


//Number Pyramid
/* 
import java.util.*;
public class Patterns2{
    public static void main(String args[]){

        int n=5;

        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop-->spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers -> print row no. row  no. times
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}  */
 

//palindrome pattern

/* 
import java.util.*;
public class Patterns2{
    public static void main(String args[]){
        int n=5;

        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //1st part numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            //2nd part numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}*/


//Diamond pattern
public class Patterns2{
    public static void main(String args[]){
        int n=4;

        //upper half
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

          //Lower Half
                for(int i=n;i>=1;i--){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

