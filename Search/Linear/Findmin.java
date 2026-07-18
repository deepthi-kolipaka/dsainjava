package Search.Linear;

public class Findmin {
    public static void main(String[] args) {
        int nums[]={2,9,4,6,-4,-12,0};
        int ans=findindex(nums);
        System.out.println(ans);
    }
    static int findindex(int arr[]){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
