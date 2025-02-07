//(1).Tower of Hanoi  : Rules==>(1).only one disk transferred in 1 step. (2).Smaller disks are alaways kept on top of larger disks
//Time compexity : O(2^n-1)= O(2^n)
/* 
public class Recursion2 {
    public static void towerOfHanoi(int n , String src , String helper , String dest){
        if(n==1){  // base condition
            System.out.println("transfer disk "+ n +" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1,src,dest,dest);//src to helper
        System.out.println("transfer disk "+n+" from "+src+" to "+dest); //recursion step
        towerOfHanoi(n-1,helper,src,dest);//helper to dest
    }
    public static void main(String args[]){
        int n = 3;
        towerOfHanoi(n, "S", "H",  "D");
    }
}*/

//(2).Reverse the string 
//Time complexity = O(n) [n=string length]
/*public class Recursion2{
    public static void printRev(String str , int indx){
        if(indx==0){
            System.out.println(str.charAt(indx));
            return;
        }
        System.out.print(str.charAt(indx));
        printRev(str , indx-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printRev(str,str.length()-1); //4-1=3
    }
}*/

/*NOTE ==> using index in the case of array & string  */

//(3).Find the first & last occurance of an element in string
//Time complexity = O(n) [n=String length]

/*public class Recursion2{
    public static int first = -1; //invalid index
    public static int last = -1;

    public static void findOccurance(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar= str.charAt(idx);
        if(currChar==element){
            if(first==-1){
                first = idx;
            }else{
                last = idx;
            }
        }
        findOccurance(str, idx+1,element); //for next index
    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        findOccurance(str,0,'a');
    }
}*/


//(4).Check if an array is sorted(Strictly increasing)
//Boolean answer
//time complexity = O(n)
/*public class Recursion2{
    public static boolean isSorted(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        int arr[] = {1,3,3,5};
        System.out.println(isSorted(arr,0));
    }
} */


//(5).Move all 'x' to the end of the string
//Time complexity = O(n) [n = string length]

/*public class Recursion2{
    public static void moveAllX(String str, int idx, int count,String newString){
        if(idx == str.length()){
            for(int i=0;i<count;i++){ //count = 3(no. of x)
                newString +="x";
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar=='x'){
            count++;
            moveAllX(str ,idx+1, count, newString);
        }else{
            newString+=currChar;//newString = newString + currChar
            moveAllX(str, idx+1,count,newString);
        }
    } 
    public static void main(String args[]){
        String str = "axbcxxd";
        moveAllX(str,0,0,"");
    }
}*/


//(6).Remove duplicates in a string
//Time complexity = O(n)
/*public class Recursion2{
    public static boolean[]map=new boolean[26];

    public static void removeDuplicates(String str, int idx,String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar-'a']){
            removeDuplicates(str,idx+1,newString);
        }else{
            newString += currChar;
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newString);
        }
    }
    public static void main(String args[]){
        String str = "abbccda";
        removeDuplicates(str,0,"");
    }
}*/

//IMPORTANT
/*(7).Print all the subsequences of a string// 
Note ==> Two choices in the recursion
Time complexity ==> O(2^n) || 2^3=8
/* 
public class Recursion2{
    public static void subsequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //to be (add character)
        subsequences(str,idx+1,newString+currChar);

        //or not to be(don't add character)
        subsequences(str,idx+1,newString);
    }
    public static void main(String args[]){
        String str = "abc";
        subsequences(str,0,"");
    }
}
*/


//(8).Print all the unique subsequences of a string
/* 
import java.util.HashSet;
public class Recursion2{
    public static void subsequences(String str, int idx,String newString,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        //to be
        subsequences(str,idx+1,newString+currChar,set);

        //or not to be
        subsequences(str,idx+1,newString,set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String>set = new HashSet<>();
        subsequences(str,0,"",set);
    }
}*/


//(9).Print keyPad combination
//Time complexity ==> O(4^n)
public class Recursion2{
    public static String[] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printComb(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(idx);
        String mapping = keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printComb(str,idx+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str = "23";
        printComb(str,0,"");
    }
}