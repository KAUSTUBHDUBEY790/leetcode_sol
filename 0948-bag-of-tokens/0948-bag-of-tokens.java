class Solution {
    public int bagOfTokensScore(int[] token, int power) {
        int k=0;
        int mk=0;
        int l=0,r=token.length-1;
        Arrays.sort(token);
        while(l<=r)
        {
            if(token[l]<=power)
            {
                power -= token[l];
                k++;
                l++;
            }
            else if(token[l]>power && k>0)
            {
                power+=token[r];
                r--;
                k--;
            }   
            else
                break;
            mk = Math.max(mk,k);
        }
        return mk;
        
    }
}