class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1,ans=0;
        while(i<=j)
        {
            int res = limit-people[j];
            j--;
            ans++;
            if(i<=j && res>=people[i])
                i++;       
        }
        return ans;

        
    }
}