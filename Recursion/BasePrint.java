package Recursion;
public class BasePrint {
    static int count=0;
    static void print(){
        if(count==5){ //base condition
            return ;
        }
        else{
            System.out.println(count);
            count++;
        }
        print();
    }
    public static void main(String[] args) {
        print();
    }
}
