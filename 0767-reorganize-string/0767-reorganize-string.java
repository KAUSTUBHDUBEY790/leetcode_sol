class Solution {
    public class pair{
            char ch;
            int f;
            pair(char c,int f)
            {
                this.ch = c;
                this.f = f;
            }
        }
    public String reorganizeString(String s) {
        int k[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            k[s.charAt(i)-'a']++;
        }
        PriorityQueue<pair> a = new PriorityQueue<>((l,b)->(b.f-l.f));
        for(int i=0;i<26;i++)
            if(k[i]>0)
                a.add(new pair((char)('a'+i),k[i]));
        s ="";
        pair b = a.poll();
        s+=b.ch;
        b.f--;
        while(a.size()>0)
        {
            pair c = a.poll();
            s+=c.ch;
            c.f--;
            if(b.f>0)
                a.add(b);
            b=c;
        }
        if(b.f>0)
            return "";
        return s;
        
        
    }
}