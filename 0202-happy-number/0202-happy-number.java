class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int k=0;
        while(k!=1)
        {
            k=0;
            while(n!=0)
            {
                k+=Math.pow(n%10,2);
                n/=10;
            }
            if(a.contains(k))
                return false;
            else
                a.add(k);
            n=k;
        }
        return true;
        
    }
}