package Recursion;

public class InfiPrint {
    static void print(){
        System.out.println("hi");
        print();
    }
    public static void main(String[] args) {
    print();
    }
}
