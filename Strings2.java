
public class Strings2{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //(1).char at index 
        System.out.println (sb.charAt(0));

        //(2).set char at index 0 
        sb.setCharAt(0, 'P');
        System.out.println(sb);

        //(3).insert at index
        sb.insert(1, 'h');
        System.out.println(sb);

        //(4).delete at index
        sb.delete(2,4);
        System.out.println(sb);

        //(5).append at index
       /* * StringBuilder sb = new StringBuilder("h");
        sb.append("e");// str = str + "e";
        sb.append("l");// str = str + "l";
        sb.append("l");
        sb.append("o");
        System.out.println(sb);
        System.out.println(sb.length());*/


    }
}
