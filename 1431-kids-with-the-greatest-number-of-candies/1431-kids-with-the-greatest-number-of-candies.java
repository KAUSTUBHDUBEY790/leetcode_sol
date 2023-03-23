class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int m = c[0];
        for(int i=1;i<c.length;i++)
        {
            if(m<c[i])
                m=c[i];
        }
        ArrayList<Boolean> a = new ArrayList<>();
        for(int i=0;i<c.length;i++)
        {
            if(m<=c[i]+e)
                a.add(true);
            else
                a.add(false);
        }
        return a;
        
    }
}