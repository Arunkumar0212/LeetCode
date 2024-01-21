class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=1){
           return n;
        }
        int l=0;
        for(int r=1;r<nums.length;r++){
            if(nums[l]!=nums[r]){
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1; 
    } 
}