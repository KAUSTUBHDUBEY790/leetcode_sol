
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 1;
        int k = n;
        while(l<k)
        {
//           as the number after addition will be too large tom handle by the int we use m = l + (k-l)/2
            int m = l+ (k-l)/2;
            if(guess(m)==0)
            return m;
            else if(guess(m)==1)
            l = m+1;
            else
            k = m-1;
        }
        return l;
        
    }
}
