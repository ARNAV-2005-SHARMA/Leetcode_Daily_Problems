/*import java.util.*;
public class Functions {  
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);//call kiya function ko
    }  
}
*/

//Sum by using Function
/* 
import java.util.*;
public class Functions{
    public static int calculateSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);
        System.out.println("sum of two numbers is : "+sum);
    }
}*/

//Product
/* 
import java.util.*;
public class Functions{
    public static int calculateProduct(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("product of two numbers is : "+ calculateProduct(a,b));
    }
}

*/
//Factorial of a number
/* 
import java.util.*;
public class Functions{
    public static void printfactorial(int n){
        //loop
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int factorial =1;
        for(int i=n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        printfactorial(n); //call kiya function ko 
    }
}*/
import java.util.*;
public class Functions{
    public static void printEvenNo(int n){
        //loop
            if(n%2==0){
                System.out.println("Even no");
            }
            else{
                System.out.println("not even");
            }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEvenNo(n);
    }
    
}