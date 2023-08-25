class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length()+s2.length()!=s3.length())return false;
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int a[] : dp)Arrays.fill(a,-1);
        return f(s1,s2,s3,0,0,0,dp);
    }
    public boolean f(String s1,String s2,String s3,int i,int j,int k,int dp[][]){
        if(k==s3.length())return true;
        if(dp[i][j]!=-1)return (dp[i][j]==1)?true:false;
        if(i<s1.length() && s1.charAt(i)==s3.charAt(k)){
            if(f(s1,s2,s3,i+1,j,k+1,dp)){
                dp[i][j]=1;
                return true;
            }
        }
        if(j<s2.length() && s2.charAt(j)==s3.charAt(k)){
            dp[i][j]=1;
            if(f(s1,s2,s3,i,j+1,k+1,dp))return true;
        }
        dp[i][j]=0;
        return false;
    }
}
