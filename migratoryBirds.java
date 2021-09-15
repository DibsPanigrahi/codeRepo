import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    int max = 1;
    int key = 0;
    HashMap <Integer,Integer> data = new HashMap<>();
    for(int i=0; i<arr.size(); i++){
        if(data.containsKey(arr.get(i)))
            data.put(arr.get(i),data.get(arr.get(i))+1);
        else
            data.put(arr.get(i),1);
    }
    for(Map.Entry<Integer,Integer> entry : data.entrySet()){
        //System.out.print(" "+entry);
        //System.out.println();
       System.out.print(" "+entry.getValue());
        if(max<entry.getValue()){
            max=entry.getValue();
            key = entry.getKey();
        }
    }
    return key;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
