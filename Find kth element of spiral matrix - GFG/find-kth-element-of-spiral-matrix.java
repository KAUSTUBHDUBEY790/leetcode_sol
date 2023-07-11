//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new Solution().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    /*You are required to complete this method*/
    int findK(int m[][], int n, int ms, int k)
    {
	// Your code here
        List<Integer> a = new ArrayList<>();
        int sr = 0;
        int sc = 0;
        int er = n-1;
        int ec = ms-1;
        while(sr<=er && sc<=ec)
        {
            for(int i=sc;i<=ec;i++)
            {
                a.add(m[sr][i]);
            }
            for(int i=sr+1;i<=er;i++)
                a.add(m[i][ec]);
            for(int i=ec-1;i>=sc;i--)
            {
                if(sr==er)
                    break;
                a.add(m[er][i]);
            }
            for(int i=er-1;i>=sr+1;i--)
            {
                if(sc==ec)
                    break;
                a.add(m[i][sc]);
            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return a.get(k-1);
    }
}