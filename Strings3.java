//Practice Question
// Reverse the string 
//Time Complexity ==> 0 to n/2 ==>O(n)  n/2 is constant
// public class Strings3 {// String builder
//     public static void main(String args[]) {
//         StringBuilder sb = new StringBuilder("hello");
//         for (int i = 0; i < sb.length() / 2; i++) {
//             int front = i; // find index of the character
//             int back = sb.length() - 1 - i; // 5-1-0 = > 4

//             char frontChar = sb.charAt(front); // character at that index
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar); // exchange the character
//             sb.setCharAt(back, frontChar);
//         }
//         System.out.println(sb);
//     }
// }

// import java.util.ArrayList;
// import java.util.HashMap;
import java.util.Scanner;
// public class Strings3{
//     public static String helper(String str){
//         String[] s = str.split(" ");
//         StringBuilder sb = new StringBuilder();

//         for(String word : s){
//             if(word.length() > 0){
//                 sb.append(Character.toUpperCase(word.charAt(0)));
//                 sb.append(word.substring(1).toLowerCase());
//                 sb.append(" ");
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string : ");
//         String input = sc.nextLine();

//         String res = helper(input);
//         System.out.print(res);
//         sc.close();
//     }
// }

// Sort the String
// import java.util.*;
// public class Strings3{
//     public static String sorting(String str){
//         // step 1 -> count the frequency of character in map 
//         Map<Character,Integer> map = new HashMap<>();
//         for(char c : str.toCharArray()){
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }
//         // Step 2 Use the custom sorting 
//         List<Character> list = new ArrayList<>(map.keySet());

//         list.sort((a,b) ->{
//             int freqCompare = map.get(b).compareTo(map.get(a));
//             if(freqCompare==0){ 
//                 return Character.compare(b,a);
//             }
//             return freqCompare;
//         });
//         // Step 3 Reconstruct the String
//         StringBuilder sb = new StringBuilder();

//         for(char c : list){
//             int frequency = map.get(c);
//             for(int i=0;i<frequency;i++){
//                 sb.append(c);
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the string : ");
//         String s = sc.nextLine();
//         sc.close();

//         String res = sorting(s);
//         System.out.print(res);
//     }
// }

/*public class Strings3{

    public static String reverseWord(String str){
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<words.length;i++){
            // StringBuilder res = new StringBuilder(words[i]);
            
            // res.reverse();
            // sb.append(res);
            sb.append(new StringBuilder(words[i]).reverse());

            if(i < words.length-1){
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string : ");
        String s = sc.nextLine();

        String res = reverseWord(s);
        System.out.println(res);
        sc.close();
    }
}*/


// --Longest Palindrome Substring-- //
public class Strings3 {
    static int max = 0;
    static int start = 0, end = 0;

    public static String isP(String s) {
        int n = s.length();
        boolean isFound = false;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (check(s, i, j) == true) {
                    // isFound = true;
                    if(j - i + 1 > 1){
                        isFound = true;
                        if (j - i + 1 > max) {
                            max = j - i + 1;
                            start = i;
                            end = j;
                        }
                    }
                }
            }
        }
        if (!isFound) {
            return "empty";
        }
        return s.substring(start, end + 1);
    }

    public static boolean check(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String args[]) {
        String str1 = "ad";

        String out = isP(str1);
        System.out.print(out);
    }
}