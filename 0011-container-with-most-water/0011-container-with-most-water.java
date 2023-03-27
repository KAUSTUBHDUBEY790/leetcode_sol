class Solution {
    public int maxArea(int[] h) {
        int x = h.length-1;
        int y=0;
        int maxl = h[y], maxr = h[x];
        int maxp = y, maxpr = x;
        int sum = Math.min(h[x],h[y])*(x -y);
        while(x>0){
            if(h[y]>maxl)
            {
                maxl = h[y];
                maxp = y;
                int s = Math.min(maxl,maxr)*(maxpr - maxp);
                if(sum<s)
                    sum = s;  
            }
            System.out.println(maxl);
            if(h[x]>maxr)
            {
                maxr = h[x];
                maxpr = x;
                int s = Math.min(maxl,maxr)*(maxpr - maxp);
                if(sum<s)
                    sum = s;  
            }
            if(maxr>maxl)
            y++;
            else
            x--;
        }
        return sum;
        
        
    }
}