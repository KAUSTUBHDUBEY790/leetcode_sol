// Question: Print words present in the string, in the order in which it appears in the string.
---------------------------------------------------------------------------
// Sample Input
// IAmACompetitiveProgrammer
  -------------------------------------------------------------------------
// Sample Output
// I
// Am
// A
// Competitive
// Programmer
  -----------------------------------------------------------------------
  
//   Solution:
  
  import java.util.*;
public class Main {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>= 'A' && s.charAt(i)<= 'Z')
			{
				String k = "";
				k+=s.charAt(i);
				i++;
				while(i<s.length() && !(s.charAt(i)>='A' && s.charAt(i)<= 'Z'))
				{
					k+=s.charAt(i);
					i++;
				}
				System.out.println(k);
				i--;
			}
		}

    }
}
