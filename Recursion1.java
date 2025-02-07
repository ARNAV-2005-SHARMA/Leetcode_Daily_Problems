//(1).print number 1 to 5 

/*public class Recursion1{
    public static void printNumber(int n){
        if(n==6){    // base case
            return;  
        }
        System.out.println(n); // print
        printNumber(n+1);   // recursion step
    }
    public static void main(String args[]){
        int n =1;

        printNumber(n); // call kiya main function ko
    }
}*/

//(2).print sum of first n natural number

public class Recursion1{
    public static void printSum(int i , int n , int sum){
        if(i==n){
            sum = sum + i;
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printSum(i+1,n,sum);
    }
    public static void main(String args[]){
        printSum(0,6,0);
    }
}

//(3).print Factorial of a number n

/*public class Recursion1{
    public static int calcfactorial(int n){
        if(n ==1 ){ //Base Case
            return 1;
        }
        int fact_nm1 = calcfactorial(n-1);
        int fact_n = n*fact_nm1;
        return fact_n;
    }
    public static void main(String args[]){
        int n = 7;
        int ans = calcfactorial(n);
        System.out.println(ans);
    }
}*/

//(4).Print the fibonacci series till nth term

/*public class Recursion1{
    public static void printFib(int a , int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }
    public static void main(String args[]){
        int n =7;
        int a=0 , b=1;
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);
    }
}*/

//(5).print x^n(stack height = n)  // stack height = (n-1)==> n  [n=5 & level =6]  
//Value of n is almost equal to level or height of the stack

/*public class Recursion1{
    public static int calcPower(int x , int n){
        if(n==0){  //base case 1
            return 1;
        }
        if(x==0){  //base case 2
            return 0;
        }
        int xPownm1 = calcPower(x , n-1); // work for recursion
        int xPown = x * xPownm1;
        return xPown;
    }
    public static void main(String args[]){
        int x =2 , n=5;
        int ans= calcPower(x,n);
        System.out.println(ans);
    }
}

//(6).Print x^n(stack height = logn)

/*public class Recursion1 {
    public static int calcPower(int x, int n) {
        if (n == 0) { // base case 1
            return 1;
        }
        if (x == 0) { // base case 2
            return 0;
        }
        // if n is even
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {// n is odd
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }

    public static void main(String args[]) {
        int x = 3, n = 5;
        int ans = calcPower(x, n);
        System.out.println(ans);
    }
}*/