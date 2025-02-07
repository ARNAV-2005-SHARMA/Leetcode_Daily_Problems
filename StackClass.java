//--Stack using Collection Framework--//
/* 
import java.util.*;

public class StackClass{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/


//--2).Push at bottom of Stack

/* 
import java.util.*;

public class StackClass{
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){ //Base case(add the number at bottom)
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4, s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/



//--3).Reverse a Stack
/* 
import java.util.*;


public class StackClass{
    //push the element at the bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int temp = s.pop();
        pushAtBottom(s, data);
        s.push(temp);
    }

    //code to reverse the stack
    
    public static void reverse(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        reverse(s);//call the reverse function

        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}*/

//4).Next greater element
