import java.util.*;    //package

public class Conditions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        int button = sc.nextInt();
        sc.close();

        //if(x%2==0){
          //  System.out.println("even");
        //}
        //else{
          //  System.out.println("odd");




          //if(age>18){
            //System.out.println("adult");
          //}
          //else{
            //System.out.println("not adult");


            //if(a==b){
            //    System.out.println("equal");
            //}
            //else if(a>b){
            //    System.out.println("a is greater");
            //}
            //else{
            //    System.out.println("a is lesser");
            //}



            //if(button ==1){
              //  System.out.println("Hello");
            //}
            //else if(button==2){
              //  System.out.println("Namaste");
            //}
            //else if(button==3){
              //  System.out.println("bonjour");
            //}
            //else{
              //  System.out.println("Invalid button");
            //}


            switch(button){
                case 1 : System.out.println("hello");
                break;
                case 2 : System.out.println("namaste");
                break;
                case 3 : System.out.println("bonjour");
                break;
                default : System.out.println("invalid");
            }
          }
        } 
    

