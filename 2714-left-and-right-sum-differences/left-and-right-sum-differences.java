class Solution {
    public int[] leftsum(int[] nums){
        int[] ans = new int[nums.length];
        ans[0]=0;
        for(int i = 1; i < nums.length;i++){
            ans [i] = ans[i-1] + nums[i-1];
        }
        return ans;
    }
    public int[] rightsum(int[] nums){
        int[] ans = new int[nums.length];
        ans[nums.length-1]=0;
        for(int i = nums.length-2; i >=0 ;i--){
            ans [i] = ans[i+1] + nums[i+1];
        }
        return ans;
    }
    public int[] leftRightDifference(int[] nums) {
        int[] res = new int[nums.length];
        int[] arr1 = rightsum(nums);
        int[] arr2 = leftsum(nums);
        for(int i =0;i<nums.length;i++){
            res[i] = Math.abs(arr2[i]-arr1[i]);
        }
        // System.out.print(arr1[1]);
        // System.out.print(arr2[1]);
        return res;
    }
}