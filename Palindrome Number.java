class Solution {
    public int rev(int x){
        int sum = 0;
        while(x>0)
        {
           sum = sum*10 + x%10;
            x=x/10;
        } 
        return sum;
    }
    public boolean isPalindrome(int x) {
        Solution obj = new Solution();
        if(x<0)
            return false;
        else{
            if(x==obj.rev(x))
                return true;
            else
                return false;
            
        }
        
    }
}
