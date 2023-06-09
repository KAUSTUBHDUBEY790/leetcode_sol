class Solution {
    public char nextGreatestLetter(char[] l, char t) {
        // int a = (int) t;
        // System.out.println((int)l[0]==a);
        // if(t<l[0])
        //     return l[0];
        // else if(t>l[l.length-1])
        //     return l[0];
        // else if(t==l[0])
        //     return l[1];
        // else if(t==l[l.length-1])
        //     return l[0];
        int k=0,k2=l.length-1;
        while(k<=k2)
        {
            int m = (k2+k)/2;
            if(l[m]<=t)
                k = m+1;
            else
                k2 = m-1;
}
            return k==l.length?l[0]:l[k];
            
            
        
        
        
    }
}