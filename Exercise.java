/*import java.util.*;
public class Exercise{
    public static void main(String args[]){
1).
         Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println(average);
        

2).
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any odd number: ");
        int n = sc.nextInt();
        int sum = 0;
        
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of odd numbers : "+ sum);
    }
}*/

//3).
/*import java.util.*;
public class Exercise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
    }
}*/

//4).
/*import java.util.*;
public class Exercise{
    public static void main(String args[]){
        System.out.println("Enter any radius : ");
        Scanner sc = new Scanner(System.in);
        double radius =sc.nextDouble();
        double circumference = 2*3.14*radius;
        System.out.println(circumference);

    }
}*/

//5).
/*import java.util.*;
public class Exercise{
    public static void main(String args[]){
        System.out.println("Enter any age no. : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
    }
}
*/

//6). Infinite loop using do while condition

/*import java.util.*;
public class Exercise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{

        }
        while(true);
    }
}*/


//7).
/* 
import java.util.*;
public class Exercise{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int positive =0, negative =0, zeros =0;
        for(int i=0;i>=0;i++){
            System.out.println("Enter any number = ");
            int n = sc.nextInt();
            if(n==0){
                zeros++; 
            }
            else if(n>0){
                positive++;
            }
            else{
                negative++;
            }
            System.out.println("Enter 0 to terminate or 1 to continue");
            int x = sc.nextInt();
            if(x==0){
                break;
            }
            else{
                continue;
            }
        }
        System.out.println("Number of psitive integers= "+positive);
        System.out.println("Number of negative integers= "+negative);
        System.out.println("Number of Zeroes= "+zeros);
    }
}*/


//8). calculate power of number x^n
import java.util.*;
public class Exercise{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x ");
        int x = sc.nextInt();
        System.out.println("Enter power ");
        int power = sc.nextInt();
        int result = 1;
        for(int i=1;i<=power;i++){
            result=result*x;
        }
        System.out.println("Result = "+ result);
    }
}