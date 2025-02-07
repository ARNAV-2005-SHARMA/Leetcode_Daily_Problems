//import java.util.*;
/* 
public class Loops3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();


        print all even numbers till n
        for(int i =0; i<=n; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

    }
}*/

/*Check number is prime or not*/
//input number 7 -->Prime number 
import java.util.Scanner;
public class Loops3{
    public static void main(String args[]){
        System.out.println(" Enter any number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;

            
        for(int i = 1; i<=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("not Prime Number");
        }



    }
}