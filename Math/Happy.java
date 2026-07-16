package Math;
import java.util.*;
public class Happy {
    static boolean check(int n){
        for(int i=0;i<100;i++){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        n=sum;
        if(sum==1){
            return true;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
    boolean a=check(n);
    System.out.println(a);
    }
}
