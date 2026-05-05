import java.util.Arrays;
import java.util.Scanner;
public class Leftrotate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        //Left rotate an array
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
