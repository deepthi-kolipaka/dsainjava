package Search.Linear;

import java.util.Arrays;

public class Searchin2D {
    public static void main(String[] args) {
        int arr[][]={
            {1,5,2},
            {3,0,51},
            {9,-2,9}
        };
        int target=9;
        int ans[]=findindex(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] findindex(int arr[][],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
