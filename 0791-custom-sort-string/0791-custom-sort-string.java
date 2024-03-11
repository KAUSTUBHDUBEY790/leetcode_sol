class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character,Integer> a = new HashMap<>();
        for(int i=0;i<s.length();i++)
            a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)+1);
        String str="";
        for(char i:order.toCharArray())
        {
            if(a.containsKey(i))
            {
               int j = a.get(i);
                while(j-->0)
                    str+=i;
                a.remove(i);
            }
        }
        for(char i:s.toCharArray())
            if(a.containsKey(i))
                str+=i;
        return str;
        
    }
}