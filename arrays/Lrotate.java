import java.util.Arrays;
import java.util.Scanner;
public class Lrotate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter array size");
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //rotating the array by k places left side
        System.out.println("Enter how many places you want to rotate an array");
        int k=in.nextInt();
        k=k%n; //reducing the k size by using index 
        int []temp=new int[k];
        for(int i=n-k;i<n;i++){
            temp[i]=arr[i];
        }
System.out.println(Arrays.toString(temp));
    }
}
