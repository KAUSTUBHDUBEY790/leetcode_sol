class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int curr = r;
        int arr[] = new int[nums.length];
        while(l <= r){
            int tl = nums[l]*nums[l];
            int tr = nums[r]*nums[r];
            if(tl > tr){
                arr[curr--] = tl;
                l++;
            } else {
                arr[curr--] = tr;
                r--;
            }
        }
        return arr;
      

        
    }
}