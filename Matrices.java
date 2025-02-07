//Print the matrix
/* *
import java.util.*;
public class TwoDArrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close(); 
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        // array input
        int [][] numbers = new int [rows][columns];

        //input
        //rows
        for(int i =0;i<rows;i++){
            //columns
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        //Output
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

    }  
}*/

//Print the index of the number
import java.util.*;
public class Matrices{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        //array input
        int numbers[][]= new int[rows][columns];
        //Input
        //rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<columns;j++){
                numbers[i][j]=sc.nextInt();
            }
        }
        int key = sc.nextInt();

        //Output
        for(int i =0;i<rows;i++){
            for(int j=0;j<columns;j++){
                //compare with x
                if(numbers[i][j] ==key){
                    System.out.println("x found at locations (" + i + " , " + j + ")"); 
                }
            }
        }
    }
}