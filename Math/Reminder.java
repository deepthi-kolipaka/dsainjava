package Math;
import java.util.Scanner;
public class Reminder{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Reminder when the value is divided by 10 "+n%10);
    }
}