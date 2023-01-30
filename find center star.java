class Solution {
    public int findCenter(int[][] edges) {
        int k = edges.length;
        int l[] = new int[k+2];
        for(int i=0;i<k;i++)
        {
            l[edges[i][0]]++;
            l[edges[i][1]]++;
            if(l[edges[i][0]]>1) return edges[i][0];
            if(l[edges[i][1]]>1) return edges[i][1];

        }
        return -1;


        
    }
}
// ---------------------------A more efficient code than the first using hashset---------------------------------
// class Solution {
//     public int findCenter(int[][] edges) {
//         Set<Integer> outEdgesFound = new HashSet<>();
//         // we use hashset here as we dont want to manage an different array 
//         for(int[] edge: edges){
//             if(outEdgesFound.contains(edge[0])){
//                 return edge[0];
//             }
//             if(outEdgesFound.contains(edge[1])){
//                 return edge[1];
//             }
//             outEdgesFound.add(edge[0]);
//             outEdgesFound.add(edge[1]);
//         }

//         return -1;


        
//     }
// }
