class Solution {
    public int largestAltitude(int[] g) {
        int l=0,h=0;
        for(int i=0;i<g.length;i++)
        {
            l+=g[i];
            if(l>h)
                h=l;            
        }
        return h;
        
    }
}