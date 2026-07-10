package Recursion.Basicproblems;
import java.util.*;
public class Print {
    static void f(int i,int n){
        if(i>n){
            return ;
        }
        else {
            System.out.println("Hey Deepthi");
            f(i+1,n);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        f(1,n);
    }
}
