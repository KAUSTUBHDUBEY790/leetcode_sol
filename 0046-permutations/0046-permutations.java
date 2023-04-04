class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> a = new ArrayList<List<Integer>>();
        permute(a,new ArrayList<>(),nums,new boolean[nums.length]);
        return a;
    }
    public void permute(List<List<Integer>> a,List<Integer> b,int n[],boolean visit[])
    {
        if(b.size()==n.length)
        {
            a.add(new ArrayList(b));
            return;
        }
        for(int i=0;i<n.length;i++)
        {
            if(visit[i]==true) continue;
            b.add(n[i]);
            visit[i] = true;
            permute(a,b,n,visit);
            b.remove(b.size()-1);
            visit[i] = false;            
        }
    }
}