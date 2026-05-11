import java.util.Scanner;
public class Secondsmallest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]!=smallest&&arr[i]<ssmallest){
                ssmallest=arr[i];
            }
        }
        System.out.println("Second smallest element in an array:"+ssmallest);

    }
}