class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        String a[] = s.split(" ");
    
        return a[a.length-1].length();
    }
}