//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> data = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
            data.put(name,phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
            boolean flag = true;
            if(data.containsKey(s.toLowerCase())){
                System.out.println(s.toLowerCase()+"="+data.get(s.toLowerCase()));  
            }
            else
                System.out.println("Not found");
		}
	}
}




