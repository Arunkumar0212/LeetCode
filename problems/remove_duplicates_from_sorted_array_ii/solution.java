class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<3){
            return n; 
        }
        int l=2;
        for (int r=2;r<n;r++){
            if(nums[r]!=nums[l-2]){
                nums[l]=nums[r];
                l++;
            }
        }
    return l;
    }
}