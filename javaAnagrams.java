import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        char[] a1 = a.toLowerCase().toCharArray();
        char[] b1 = b.toLowerCase().toCharArray();
        java.util.Arrays.sort(a1);
        java.util.Arrays.sort(b1);
        if(java.util.Arrays.equals(a1,b1))
            return true;
        else
            return false;
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}