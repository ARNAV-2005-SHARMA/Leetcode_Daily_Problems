// public class ExceptionHandling {
//     public static void main(String[] args) {
        
//         try{
//             int a =2;
//             int b=12;
//             int d= b/a;
//             System.out.println(d);
//             int[] arr = new int [5];
//             System.out.println(arr[7]);
//         }catch(ArithmeticException e){
//            System.out.println("Divide by zero");
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Array Out of Bound Index");
//         }finally{
//             System.out.println("Bas ho gaya bhai rahene de tu");
//         }
//         System.out.println("After Catching");

//     }
// }

// public class ExceptionHandling {

//     // Make MyException static to use it in the static main method
//     static class MyException extends Exception {
//         int message;
        
//         MyException(int msg){
//             message = msg;
//         }

//         public String toString(){
//             return "Error Number: " + message;
//         }
//     }
    
//     public static void main(String[] args) {
        
//         try {
//             int a = 0;
//             int b = 12;

//             // Uncomment these lines to test different exceptions
//             // int d = b / a; // ArithmeticException: divide by zero
//             // System.out.println(d);
//             // int[] arr = new int[5];
//             // System.out.println(arr[7]); // ArrayIndexOutOfBoundsException

//             if (a == 0) throw new MyException(12); // Throw custom exception

//             // if (a == 0) throw new NullPointerException("Some Exception occurred!!");

//         } catch (MyException e) {
//             System.out.println(e.toString());
//         } catch (NullPointerException exc) {
//             System.out.println(exc.getMessage());
//         } catch (ArithmeticException e) {
//             System.out.println("Divide by zero");
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Array Out of Bound Index");
//         } finally {
//             System.out.println("Bas ho gaya bhai rahene de tu");
//         }

//         System.out.println("After Catching");
//     }
// }



// Custom exception class
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

// Utility class with methods that may throw exceptions
class Utility {
    public static void divide(int a, int b) throws ArithmeticException {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        System.out.println("Division result: " + (a / b));
    }

    public static void checkNegative(int number) throws MyException {
        if (number < 0) throw new MyException("Negative number detected: " + number);
        System.out.println("Number is positive: " + number);
    }
}

// Main class to demonstrate exception handling
public class ExceptionHandling{
    public static void main(String[] args) {
        try {
            Utility.divide(10, 0); // May throw ArithmeticException
            Utility.checkNegative(-5); // May throw MyException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MyException e) {
            System.out.println("Custom Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
