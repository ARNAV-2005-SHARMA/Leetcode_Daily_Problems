//**Arrays as function Argument**/
//--Passing arrays as argument(pass by reference)--//
/*public class Arrays{
    public static void  update(int marks[], int nonChangable){
        nonChangable = 10;
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1; 
            marks[i] = marks[i] * 2;
        }
    }
    public static void main(String args[]){
        int marks[] = {22,88,99};
        int nonChangable = 7;
        update(marks, nonChangable);

        //print our marks

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i] + " ");
        }
    }
}*/


//--Linear Search--//
/* 
public class Arrays{
    public static int linearSearch(int nums[], int key){
        for(int i =0;i<nums.length;i++){
            if(nums[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {2,7,8,88,12,55,1};
        int key = 55;

        int index = linearSearch(nums, key);
        if(index==-1){
             System.out.println("number not found");
        }
        else{
            System.out.println("Key is at index : " + index);
        }
    }
}*/



//--3).Binary Search--//
/* 
public class Arrays{
    public static int binarySearch(int nums[], int key){
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while(start<=end){
            int mid = start +(end - start)/2;

            //comparsions
            if(nums[mid]==key){ //found
                return mid;
            }
            else if(nums[mid]<key){ //right
                start = mid + 1;
            }
            else{//left
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int nums[] = {1,7,9,43,66};
        int key = 66;

        System.out.println("Index of the key : " + binarySearch(nums, key));
    }
}*/


//--4).Reverse In Array
//--without extra array space
//Time complexity = O(n) & Space complexity = O(1)--//
/* 
public class Arrays{
    public static void reverse(int nums[]){
        int first = 0, last = nums.length-1;

        while(first <= last){
            //swap
            int temp = nums[last];
            nums[last] = nums[first];
            nums[first] = temp;

            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,9};

        reverse(nums);

        for(int i=0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}*/


//--5).Pairs in array--//
/* 
public class Arrays{
    public static void printPairs(int nums[]){
        int totalPairs = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            //int curr = nums[i]; //2, 4, 6, 8, 10
            for(int j = i+1;j<n;j++){
                System.out.print("(" + nums[i] + "," + nums[j] + ")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs : " + totalPairs);// count the number of pairs
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,9,10};
        printPairs(nums);// call the function
    }
}*/



//--6).Print Sub-Array--//

public class Arrays{
    public static void printSubArrays(int nums[]){
        int tp = 0;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j =i;j<nums.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){ //print
                    System.out.print(nums[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + tp);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        printSubArrays(nums);
    }
    public static void sort(int[] arr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }
}