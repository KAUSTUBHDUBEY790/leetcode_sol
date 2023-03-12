class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here
        int k[] = new int[3];
        for(int i=0;i<n;i++)
        {
            k[a[i]]++;
            
        }
        int j=0;
        for(int i=0;i<3;i++)
        {
            while(k[i]-->0)
            {
                a[j++] = i; 
            }
        }



    }
}
