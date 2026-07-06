package Math;
import java.util.*;
public class Countdigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int digit=in.nextInt();
        int count=0;
        while(digit>0){
            int lastdigit=digit%10;
            count+=1;
            digit/=10;
        }
        System.out.println(count);
    }
}
