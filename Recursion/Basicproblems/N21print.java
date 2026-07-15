package Recursion.Basicproblems;

public class N21print {
    static void print(int i,int n){
        if(i<n){
            return ;
        }
        else {
            System.out.println(i);
            print(i-1,n);
        }
    }
    public static void main(String[] args) {
        print(5,1);
    }
}
