/* IMPORTANT: Multiple classes and nested static classes are supported */
 
/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
//import for Scanner and other utility classes
import java.util.*;
*/
 
// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
 
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input
 
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
 
        */
 
        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T>0){
            int N = s.nextInt();   
            int K = s.nextInt();  
            List<Integer> list = new ArrayList<>();
            for(int i=0; i<N; i++){
                list.add(s.nextInt());
            } 
 
            List<Integer> newList = new ArrayList<>();
            int sum = 0;
            int j = 0;
            while(list.size()>=1){
             int frequency = Collections.frequency(list,list.get(0));
             newList.add(frequency*list.get(0));
             int num = list.get(0);
             while(frequency>0){
                list.remove(new Integer(num));
                frequency--;
            }
            }
 
            Collections.sort(newList, Collections.reverseOrder());
            while(K>0 && j<newList.size()){
                K--;
                if(newList.get(j)>0){
                    sum += newList.get(j++);
                }
                else
                    break;
            }
            
            System.out.println(sum);
            T--;
        }
 
            s.close();
 
    }
}