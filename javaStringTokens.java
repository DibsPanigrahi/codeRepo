import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
         if (s.trim().length()==0 || s.trim().length()>400000){
             System.out.println(0);
             }
        else{
            String[] str = s.trim().split("[ !,?.\\_'@]+");
            if(str!=null){
                System.out.println(str.length);
                for(String s1: str){
                    System.out.println(s1);
                }
        }
                
            }
        
        scan.close();
    }
}


