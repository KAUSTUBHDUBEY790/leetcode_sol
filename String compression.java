// Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2d1s1.
// ---------------------------------------------------------------------------------------------------
// Input Format
// A single String S

// Constraints
// 1 < = length of String < = 1000
// --------------------------------------------------------------------------------------------------
// Output Format
// The compressed String.
// --------------------------------------------------------------------------------------------------
// Sample Input
// aaabbccds
// Sample Output
// a3b2c2d1s1




// solution-

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String k = "";
        for(int i=0;i<s.length();i++)
        {
            int l =1;
            k+=s.charAt(i);
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
            {l++;
            i++;
            }
            k+= Integer.toString(l);
        }
        System.out.println(k);

    }
}
