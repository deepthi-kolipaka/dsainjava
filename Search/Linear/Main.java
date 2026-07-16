package Search.Linear;

public class Main {
    public static void main(String[] args) {
      int arr[]={2,5,8,-6,3,86};
      int ans=linearsearch(arr, 18); //here 18 is target
      System.out.println(ans);
    }
    static int linearsearch(int nums[],int target){
        if(nums.length==0){
            return -1;
        }
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                return i; //returns the index of the element 
            }
        }
        return -1;
    }
}
