import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int j=0;
        int num = end-start;
        char[] arr = new char[num];
        for(int i=start; i<end; i++){
            arr[j] = S.charAt(i);
            j++;
        }
        for(char c: arr){
            System.out.print(c);
        }
    }
}

