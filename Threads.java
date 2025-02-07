// import java.util.*;
public class Threads {
    public static void main(String args[]){
        Thread t = Thread.currentThread();
        System.out.println(t);
        t.setName("ChangedName");
        System.out.println(t);
        
        try{

            for(int i=0;i<=10;i++){

                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println();
        }
       
    }
}
