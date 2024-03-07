class Solution {
    public String reverseWords(String s) {
        String a[] = s.trim().replaceAll("\\s+", " ").split(" ");
        s = "";
        s+=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            s+=" ";
            s+=a[i];
        }
        return s;
        
    }
}