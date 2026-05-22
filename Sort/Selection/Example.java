package Sort.Selection;
import java.util.*;
public class Example {
    //select min element from array and swap both
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    //now the logic hasbeen implementing
    for(int i=0;i<=n-2;i++) {
        int min=i;
        for(int j=i;j<=n-1;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int s=arr[min];
        arr[min]=arr[i];
        arr[i]=s;
    }
    System.out.println(Arrays.toString(arr));
    }
   
   
}
