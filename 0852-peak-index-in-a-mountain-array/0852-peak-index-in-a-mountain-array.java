class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l=0;
        int h=arr.length-1;
        while(l<h)
        {
            int mid = (l+h)/2;
            if(arr[mid]>arr[mid+1])
            {
                h=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                l = mid+1;
            }
        }
        return l;
        
    }
}