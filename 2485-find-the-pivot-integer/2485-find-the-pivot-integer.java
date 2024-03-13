class Solution {
    public int pivotInteger(int n) {
        if(n==1)
            return 1;
       int i=2,j=n-1;
        int s1=1,s2=n;
        while(i<=j)
        {
            if(s1>s2)
            {
                s2+=j--;
            } 
            else if(s1<s2)
            {
                s1+=i++;
            }
            else if(s1==s2 && i==j)
                return i;
            else
            {
                s1+=i++;
            }
        }
        return -1;
    }
}