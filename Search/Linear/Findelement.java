package Search.Linear;

public class Findelement {
    static int find(int arr[],int target){
        if(arr.length==0){
            return -1;
        }
        for(int element : arr)
        {
            if(element==target){
                return element;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={2,8,9,4,4,2,0,1,-4};
        int ans=find(nums,18); //if element found returns element if not returns -1
        System.out.println(ans);
    }
}
