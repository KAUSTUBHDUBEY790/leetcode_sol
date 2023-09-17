class Solution {
    public int climbStairs(int n) {
        int a[] = new int[n+1];
        return stairs(n,a);   
    }
    public int stairs(int n,int[] a)
    {
        if(n==0 || n==1)
            return 1;
        if(a[n]!=0)
            return a[n];
        return a[n] = stairs(n-1,a)+stairs(n-2,a);
    }
}