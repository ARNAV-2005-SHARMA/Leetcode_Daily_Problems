/*import java.util.ArrayList;
import java.util.Collections;


class ArrayLists {
   public static void main(String args[]) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList<String> list2 = new ArrayList<String>();
       //ArrayList<Boolean> list3 = new ArrayList<Boolean>();
      
       //add elements
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(5);
       System.out.println(list);


       //to get an element
       int element = list.get(0); // 0 is the index
       System.out.println(element);


       //add element in between
       list.add(1,2); // 1 is the index and 2 is the element to be added
       System.out.println(list);


       //set element
       list.set(0,0);
       System.out.println(list);


       //delete elements
       list.remove(0); // 0 is the index
       System.out.println(list);


       //size of list
       int size = list.size();
       System.out.println(size);


       //Loops on lists
       for(int i=0; i<list.size(); i++) {
           System.out.print(list.get(i) + " ");
       }
       System.out.println();


       //Sorting the list
       list.add(0);
       Collections.sort(list);
       System.out.println(list);
   }
}
*/

//----------1).Container with most Water------------//
//Important ques.

//Space Complexity = O(1)

/*import java.util.ArrayList;
class ArrayLists{

    //Brute Force Approach
    //Time complexity = O(n^2) 
    /*public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;

        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int currwater = ht * width;
                maxWater = Math.max(maxWater, currwater);
            }
        }
        return maxWater;
    }*/

    //Two Pointer Approach
    //Time Complexity = O(n)
    /*public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            //Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currwater = ht * width;
            maxWater = Math.max(maxWater, currwater);

            //update pointer
            if(height.get(lp) < height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(2);
        height.add(2);
        height.add(5);
        height.add(6);
        height.add(8);
        height.add(3);
        height.add(4);

        System.out.println(storeWater(height));

    }
}*/



//--2).Find if any pair in a Sorted & Rotated ArrayList has a target sum (Pair Sum -2)
//Time Complexity = O(n)

import java.util.ArrayList;

class ArrayLists{
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int n = list.size();
        int bp = -1; //breaking point(pivot point)
        for(int i=0;i<n;i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1; //smallest number(i+1)
        int rp = bp; //largest number(i)

        while(lp != rp){
            //case1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //case2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }
            else{
                //case3
                rp = (n+rp-1) % n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10 - Sorted & Rotated
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 15;
        System.out.println(pairSum2(list, target));
    }
}

