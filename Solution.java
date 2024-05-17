import java.io.*;
import java.util.*;


class calc{
    
    public static String Valid(String s){
         char [] chr = s.toCharArray();
         boolean flag = true; 
         for(int i =0; i<chr.length;i++){
             if(i<5 || i==9){
                 if(!Character.isUpperCase(chr[i]) || !Character.isLetter(chr[i])){
                     flag = false;
                 }
             }
             if(i>4 && i< 9){
                 if(!Character.isDefined(chr[i])){
                     flag = false;
                 }
             }
         }
         if(flag){
             return "YES";
         }
         else {
             return "NO";
         }
    }
}
public class PANVa {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int read = sc.nextInt();
        for(int i =0; i<read;i++){
            String in =  sc.next();
            String res = calc.Valid(in);
            System.out.println(res);

        
    }
    }
}