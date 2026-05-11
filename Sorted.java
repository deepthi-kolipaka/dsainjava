import java.util.Scanner;
public class Sorted{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){

            }
            else {
                System.out.println("array is un sorted");
            }
        }
        System.out.println("Array is sorted");
    }
} 