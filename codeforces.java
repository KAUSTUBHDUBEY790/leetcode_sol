#include <bits/stdc++.h>
using namespace std;
 
int main(){
    int kaustubh;
    cin>>kaustubh;
    while(kaustubh--){
        int xo,yo;
        cin>>xo>>yo;
        int arr[xo];
        set<int>stc;
        int max=INT_MIN;
        for(int i=0;i<xo;i++){
            cin>>arr[i];
            stc.insert(arr[i]);
            
        }
        for(int i=0;i<xo;i++){
            if(max<arr[i])
            max=arr[i];
        }
        int su=0;
        int numb=1;
        while(numb){
            if(stc.find(numb)!=stc.end()){
                numb++;
                continue;
                
            }
            su+=numb;
            if(su>yo){
                cout<<"NO"<<endl;
                break;
            }
            stc.insert(numb);
            if(su==yo){
                int tap=0;
                for(int ki=1;ki<=max;ki++){
                    if(stc.find(ki)!=stc.end())
                    continue;
                    tap=1;
                    break;
                }
                if(!tap) cout<<"YES"<<endl;
                else cout<<"NO"<<endl;
                break;
            }
            numb++;
        }
    }
    return 0;
}
