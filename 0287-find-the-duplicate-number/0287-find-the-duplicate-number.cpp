class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int i = 0;
        // int j = i+1;
        sort(nums.begin(),nums.end());
        while(i<nums.size()){
            if((nums[i] ^ nums[i+1]) == 0){
                return nums[i];
            }
            else{
                i++;
            }
        }
        return 0;
    }
};