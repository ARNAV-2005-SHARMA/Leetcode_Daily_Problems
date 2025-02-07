/* 
import java.util.*;
public class Strings {
    public static void main(String args[]){
        /*Scanner sc = new Scanner(System.in);

        String name = sc.nextLine(); //full line input
        System.out.println("Your name is : "+ name);*/

        //string name = sc.next(); ==>single word input

        // (1).Concatenation ==> Join the two sentences

       /*  String firstname = "tony";
        String lastname = "stark";
        String fullname = firstname+"@"+lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());     // Check the length of the string

        // (2).charAt ==> To print every single word (one by one) of string

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }
    }
}*/
/* *
import java.util.*;
public class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        sc.close();

        // (3). Compare the two string

       // String name1= "Tony";
       // String name2= "Mony";

        //1) string1 > string2 : +ve value
        //2) s1 == s2 : 0
        //3) s1 < s2 : -ve value

        /*if(name1.compareTo(name2) == 0){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }*/
        // Another method for non primitive datatype string 

        /*if(new String ("Tony") == new String("Tony")){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }*
       String sentence = "My name is Tony";
       String name = sentence.substring(3);
        System.out.println(name);

       String sentence2 = "TonyStark";
       String name2 = sentence2.substring(4 , sentence2.length());
       System.out.println(name2); 

    
       //substring(beg index , end index)
       
       String sentence3 = "ArnavSharma";
       String name3 = sentence3.substring(5,11); 
       System.out.println(name3);
    }
}
**/
// (4) Note ==> Strings are Immutable (Strings can't be modified) || (Always create the new strings)


// (5) ParseInt Method of Integer class

/*public class Strings {
   public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
      
      
   }
}
*/

// (6) ToString Method of String class


public class Strings {
   public static void main(String args[]) {
      int number = 123;
      String str = Integer.toString(number);
      System.out.println(str.length());
      
      
   }
}
