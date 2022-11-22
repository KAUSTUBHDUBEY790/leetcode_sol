class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<Integer>(); 
        int a[] = new int [nums.length+1];
        Arrays.fill(a,0);
        for(int i=0;i<nums.length;i++)
        a[nums[i]]++;
        for(int i=1;i<nums.length+1;i++)
        if(a[i]==0)
        list.add(i);

        return list;
    }
}
