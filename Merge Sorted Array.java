class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []k = new int[m+n];
        int i=0,j=0,l=0;
        while(i<m && j<n)
        {
            if(nums1[i]>nums2[j])
            {
                k[l++] = nums2[j++];
            }
            else if(nums1[i]<nums2[j])
            {k[l++] = nums1[i++];}
            else if(nums1[i]==nums2[j])
            {
                k[l++] = nums1[i++];
                k[l++] = nums2[j++];
            }
        }
        while(i<m)
        k[l++] = nums1[i++];
        while(j<n)
        k[l++] = nums2[j++];
        i=0;
        while(i<m+n)
        nums1[i] = k[i++];

       
        
    }
}
