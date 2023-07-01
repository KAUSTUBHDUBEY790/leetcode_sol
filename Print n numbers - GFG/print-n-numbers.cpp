//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//This Problem has been asked in Amazon, Paytm, Amdocs
//So Don't Loose hope Keep Trying by 
//  Post on LinkedIn
/*
                #PlacementEdition
                
    Get Gifts on Maximum Reach Everyday
*/

class Solution {
  public:
    void printN(int n) {
     int i = 0;
 
begin:
    i = i + 1;
    cout << i << " ";
 
    if (i<n) {
        goto begin;
    }
    

     cout<<endl;
    }
};


//{ Driver Code Starts.

int main(){
    int t;
    scanf("%d ",&t);
    while(t--){
        
        int n;
        scanf("%d",&n);
        if(n>100000){
                cout<<"You are excedding limit";
                return 0;
        }
        Solution obj;
        
        obj.printN(n);
        
    }
}

// } Driver Code Ends