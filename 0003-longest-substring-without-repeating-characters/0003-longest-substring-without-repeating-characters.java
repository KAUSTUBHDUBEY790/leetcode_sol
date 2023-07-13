class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0,i=0,j=0;//created i(stationary/starting of substring) j(moving & ending value pf substring)
        Set<Character> set = new HashSet<>();// created a char hash set

        while(j<s.length()){//// if j is less than length
            if(!set.contains(s.charAt(j))){// if set does not contain value at j
                set.add(s.charAt(j++));// set will add j and increment its index value
                max=Math.max(max,set.size());// max size of string that is unique
            }else{
                set.remove(s.charAt(i++));// else remove value at i(which is dublicte) or starting index and increment its index value
            }
        }
        return max;
    }
}