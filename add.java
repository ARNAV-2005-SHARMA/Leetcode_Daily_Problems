import java.util.Arrays;

public class add {
    public static void main(String args[]) {
        int arr[] = {1, 10, 4, 7, 2, 9};
        Arrays.sort(arr);  // Sorting the array
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
