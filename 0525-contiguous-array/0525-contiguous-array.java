class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0, sum = 0;
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0) sum--;
            else sum++;
            if(sum == 0) max = i+1;
            else if(hm.containsKey(sum)) max = Math.max(max, i-hm.get(sum));
            else hm.put(sum, i);
        }
        return max;
    }
}