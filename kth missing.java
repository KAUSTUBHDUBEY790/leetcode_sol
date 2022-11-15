class Solution {
    public int findKthPositive(int[] arr, int k) {
        int a[] = new int[2001];
        Arrays.fill(a,1);
        for(int ar: arr)
        {
            a[ar]=0;
        }
        int h=0,i=1;
        while(h<k && i<2001)
        {
            if(a[i]==1)
            h++;
            i++;
        }
        return i-1;
        
        
    }
}
