// class Solution {
//     public boolean searchMatrix(int[][] m, int t) {
//         int l=0;
//         int h=m.length*m[0].length-1;
//         while(l<=h)
//         {
//             int mid=l+(h-l)/2;
//             // System.out.println(mid/m[0].length);
//             System.out.println(mid);
//             int i = mid%m[0].length;
//             int j = mid/m.length;
//             // if(j>=m.length || i>=m[0].length)
//             //     break;
//             // System.out.println(m[j][i]);
//             if(m[j][i]==t)
//             {
//                 return true;                
//             }
//             if(m[j][i]<t)
//                 l = mid+1;
//             else
//                 h=mid-1;
//         }
//         return false;
        
        
//     }
// }
class Solution {
    int m,n;
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        m=matrix.length; n=matrix[0].length;
        int left=0, right=m*n-1;
        while(left<=right){
            int mid=(left+right)/2;
            int leftVal=getVal(left, matrix), rightVal=getVal(right, matrix), midVal=getVal(mid, matrix);
            if(midVal==target) return true;
            else if(midVal>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;     
    }

    public int getVal(int x, int[][] matrix){
        return matrix[x/n][x%n];
    }

}