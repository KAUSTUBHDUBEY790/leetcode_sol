class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int l=0;
        int i=m.length;
        int j =m[0].length; 
        int h=i*j-1;
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            // System.out.println(mid/m[0].length);
            // if(j>=m.length || i>=m[0].length)
            //     break;
            // System.out.println(m[j][i]);
            if(m[mid/j][mid%j]==t)
            {
                return true;                
            }
            if(m[mid/j][mid%j]<t)
                l = mid+1;
            else
                h=mid-1;
        }
        return false;
        
        
    }
}