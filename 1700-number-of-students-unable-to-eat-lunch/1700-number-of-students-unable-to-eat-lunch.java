class Solution {
    public int countStudents(int[] students, int[] s) {
        int z=0,o=0;
        for(int i:students)
        {if(i==0)
                z++;
         else
             o++;
        }
        Queue<Integer> a = new LinkedList<>();
        for(int i:students)
            a.add(i);
        int i=0;
        while(!a.isEmpty())
        {
            int k = a.poll();
            // System.out.println("q "+k);
            // System.out.println("s "+i);
            if(k==s[i])
            {
                if(k==0)
                    z--;
                else
                    o--;
                i++;
            }
            else
            {
                if(s[i]==0 && z<1)
                {
                    a.add(k);
                    break;
                }
                else if(s[i]==1 && o<1)
                {
                    a.add(k);
                    break;
                }
                a.add(k);       
            }

        }
        return a.size();
    }
}