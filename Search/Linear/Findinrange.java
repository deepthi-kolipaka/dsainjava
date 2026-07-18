package Search.Linear;

public class Findinrange {
    public static void main(String[] args) {
        int nums[]={1,7,8,2,4,-4,2,-5};
        int ans=checkindex(nums,1,4,-4);
        System.out.println(ans);
    }
    static int checkindex(int arr[],int start,int end ,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
