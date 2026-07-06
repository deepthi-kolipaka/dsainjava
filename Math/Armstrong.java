package Math;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int dup=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=(sum)+(r*r*r);
            n/=10;
        }
        if(sum==dup){
            System.out.println("True! its a palindrome number");
        }
        else{
            System.out.println("not a Palindrome number");
        }
    }
}
