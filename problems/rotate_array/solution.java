class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k%=n;
        if(k<0){
            k+=n;
        }
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int[] nums,int i,int j){
        int l=i;
        int r=j;
        while(l<r){
            int temp;
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}
