class Solution {
    public int[][] merge(int[][] in) {
        List<int []> a = new ArrayList<>();
        Arrays.sort(in,(j,l)-> Integer.compare(j[0],l[0]));
        int i=1;
        int s = in[0][0];
        int e = in[0][1];

        
        
        while(i<in.length)
        {
            if(e>=in[i][0])
            {
                if(e<in[i][1])
                e = in[i][1];
                i++;
            }
            else{
                int k[] = {s,e};
                a.add(k);
                s = in[i][0];
                e = in[i][1];    
                i++;
            }   
        }
        int k[] = {s,e};
        a.add(k);
        return a.toArray(new int[a.size()][2]);
    }
}