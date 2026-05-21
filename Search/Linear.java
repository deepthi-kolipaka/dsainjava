package Search;
import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();//size of the array
        int []arr=new int[n];//initializing array
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        } //inserting elements in to array
        //now we are going to perform sequential search in array
        System.out.println("Enter Searching number");
        int element=in.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==element){
                System.out.println("Element found at :"+i+"th index");
            }
        }
        System.out.println("Element not found!");
    }
}
