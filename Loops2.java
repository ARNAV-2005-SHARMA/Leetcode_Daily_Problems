import java.util.*;

public class Loops2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        //int sum =0;
        //for(int i =1;i<=n;i++){     //sum of first n natural numbers
          //  sum = sum + i;
        //}
        //System.out.println(sum);

        for(int i =1;i<11;i++){    //print table of any number
            System.out.println(i*n);
        }
    }
    
}
