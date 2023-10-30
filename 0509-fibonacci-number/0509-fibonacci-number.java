class Solution {
    public int fib(int n) {
        int a[] = new int[n+1];
         return find(n,a);
        
        
    }
    public int find(int n,int a[])
    {
        if(n<=1)
            return n;
        if(a[n]!=0)
            return a[n];
        return a[n] = find(n-1,a)+find(n-2,a);
    }
}