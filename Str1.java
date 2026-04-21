import java.util.Arrays;
import java.util.Scanner;
public class Str1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        String []a=new String[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextLine();
        }
        System.out.println(Arrays.toString(a));
    }
}
