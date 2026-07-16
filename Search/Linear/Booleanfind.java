package Search.Linear;

public class Booleanfind {
    public static void main(String[] args) {
        int nums[]={8,4,6,-1,21,2,9,0,-56,2};
        boolean ans=find(nums,12);
        System.out.println(ans);
    }
    static boolean find(int arr[],int target){
        if(arr.length==0){
            return false;
        }
        for(int element : arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
