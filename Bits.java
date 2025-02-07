//Bit Manipulation

//(1).Get Bit

/*public class Bits {
    public static void main(String args[]){
        /*int n = 5 ; // 0101==binary
        int postion = 2;
        int bitMask = 1<<postion;

        if((bitMask&n) ==0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }

        //(2).Set Bit

        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

        int newNumber = bitMask|n;
        System.out.println(newNumber);
    }
}   //Answer ==>  7 in decimal number system & 0111 in binary number system  


//(3).Clear Bit

public class Bits{
    public static void main(String args[]){
        int n = 5;//0101
        int pos = 2;
        int bitMask = 1<<pos; // left shift
        int newBitMask = ~(bitMask);

        int newNumber = notBitMask & n ;
        System.out.println(newNumber);
    }
}*/   //Answer ==> 1 in decimal number & 0001 in binary number

import java.util.*;
public class Bits{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        sc.close();
        //operation=1 : set bit  and  operation=0 : clear bit

        int n =5 ; //0101
        int pos = 1;

        int bitMask = 1<<pos;
        if(operation==1){
            //set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
        else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}