class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> a = new HashMap<>();
        int k=0;
        for(int i:nums)
        {
            if(a.containsKey(i))
            {
                a.put(i,a.get(i)+1);
            }
            else
                a.put(i,1);
        }
Iterator<Map.Entry<Integer, Integer> >
            iterator = a.entrySet().iterator();
        while (iterator.hasNext()) {
  
            Map.Entry<Integer, Integer>
                entry
                = iterator.next();

            if (1 == entry.getValue()) {
  
                k =entry.getKey();
            }
        }
  
        return k;
    }
}