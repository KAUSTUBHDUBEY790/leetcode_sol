class Solution {
    public int findComplement(int num) {
        if(num==0)
            return 1;
        if(num==1)
            return 0;
        int l = (int)(Math.floor(Math.log(num)/Math.log(2)))+1;
        int bk = (1<<(l))-1;
        return num^bk;
    }
}