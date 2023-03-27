class Solution {
    public int getSum(int x, int y) {
        
        int carry;
        while(y!=0)
        {
            carry = x&y;
            x= x^y;
            y = carry<<1;           
        }
        return x;
        
        
    }
}

//result:
// 3 =  00000011
// 2 =  00000010
// 5 =  00000101
//--------------------
//step1:
// 3 =  00000011
// 2 =  00000010
// 3&2= 00000010
//....................
//step2:
// 3 =  00000011
// 2 =  00000010
// 3^2= 00000001
//------------------
//step3:
// 3&2<<1 00000100  
// retrun to step one if y!=0;


