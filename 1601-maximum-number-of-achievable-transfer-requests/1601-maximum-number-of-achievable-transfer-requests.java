class Solution {
    int ans =0;
    public int maximumRequests(int n, int[][] r) {
        int a[] = new int[n];
        backtracking(a,r,0,0);
        return ans;
    }
    public void backtracking(int []a,int r[][],int id,int c)
    {
        if(id==r.length)
        {
            for(int i:a)
                if(i!=0)
                    return;
            ans = Math.max(ans,c);
            return;
        }
        a[r[id][0]]--;
        a[r[id][1]]++;
        backtracking(a,r,id+1,c+1);
        a[r[id][0]]++;
        a[r[id][1]]--;
        backtracking(a,r,id+1,c);
    }
}