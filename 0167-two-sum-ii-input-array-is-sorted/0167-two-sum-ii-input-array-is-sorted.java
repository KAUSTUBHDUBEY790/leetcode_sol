class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> a = new HashMap<>();
        for(int i=0;i<numbers.length;i++)
        {
            a.put(numbers[i],i);
        }
        for(int i=0;i<numbers.length;i++)
        {
            int c = target - numbers[i];
            if(a.containsKey(c) && a.get(c)!=i)
            {
                int k[]  = new int[2];
                k[0] = i+1;
                k[1] = a.get(c)+1;
                return k;
            };
        }
        int k[] = new int[2];
        return k;
        
    }
}