//(1). Bubble sort 
/*import java.util.*;
public class Sorting {
    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};

        //Time complexity = O(n^2)
        //Bubble sort (Compare the every element with adjacent element and push largest element in the last)

        for(int i=0;i<arr.length-1;i++){ //outer loop (n-1)
            for(int j=0;j<arr.length-i-1;j++){ //inner loop
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j]; //j is index number
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
}*/

//(2).Selection Sort
/*import java.util.*;
public class Sorting{
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {7,8,1,3,2};

        //Time compexity ==> O(n^2)

        //selection sort ==> compare the every ajdacent element with other and smallest in the front & then repeat the step)

        for (int i=0;i<arr.length-1;i++){ //outer loop ==> n-1 time run
            int smallest = i;    //store index of smallest number
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){ 
                    smallest = j;
                }
            }
            //swap
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }
}*/


//(3).Insertion Sort 

import java.util.*;
public class Sorting{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,4,3,1,8,7};

        //insertion sort ==> concept of sorted and unsorted array

        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1; // Start from the last element of the sorted part
            while(j>=0 && arr[j]>current){
                //keep swapping
                arr[j+1] = arr[j]; // Shift the larger element to the right
                j--; // Move j one step left
            }
            //placement
            arr[j+1]= current; // Place the current element in the correct position
        }
        printArray(arr);
    }
}//Time complexity ==> O(n^2)
// j-- moves j to the left so that we continue checking the previous elements