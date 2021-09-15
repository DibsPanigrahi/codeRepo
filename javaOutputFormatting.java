import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                System.out.print(s1);
                int x=sc.nextInt();
                for(int j=s1.length();j<15;j++){
                    System.out.print(" ");
                }
                int y=x;
                int count =0;
                while(y>0){
                    y=y/10;
                    count++;
                }
                if(count<3 && count==1){
                    System.out.print("00"+x);
                }
                else if(x==0){
                    System.out.print("000");
                }
                else if(count<3 && count==2){
                    System.out.print("0"+x);
                }
                else{
                    System.out.print(x);
                }
                System.out.println();
                //Complete this line
            }
            System.out.println("================================");

    }
}




