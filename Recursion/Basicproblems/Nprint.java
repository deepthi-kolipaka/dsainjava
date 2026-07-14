package Recursion.Basicproblems;

import java.util.Scanner;

public class Nprint {
    static void print(int i,int n){
        if(i>n){
            return ;
        }
        else {
            System.out.println(i);
            print(i+1,n);
        }
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter how many numbers you want to print");
        int n=in.nextInt();
        print(1,n);
    }
}
