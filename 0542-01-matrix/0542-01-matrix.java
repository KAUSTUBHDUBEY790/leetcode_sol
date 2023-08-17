class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int visited[][] = new int[mat.length][mat[0].length];
        int result[][] = new int[mat.length][mat[0].length];
        Queue<List<Integer>> q = new LinkedList<>();
        int steps = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
               if(mat[i][j] == 0){
                   visited[i][j] = 1;
                   q.add(new ArrayList<>(Arrays.asList(i, j, steps)));
               }
               else{
                   visited[i][j] = 0;
               }
            }
        }

        while(!q.isEmpty()){
            List<Integer> temp = q.poll();
            int row = temp.get(0);
            int col = temp.get(1);
            steps = temp.get(2);
            result[row][col] = steps;
            int[][] dis = {{1,0}, {0, 1}, {-1, 0}, {0, -1}};

            for(int d[] : dis){
                int newRow = row + d[0];
                int newCol = col + d[1];
                
                if(newRow >= 0 && newRow < mat.length && newCol >= 0 && newCol < mat[0].length && visited[newRow][newCol] != 1){
                    visited[newRow][newCol] = 1;
                    q.add(new ArrayList<>(Arrays.asList(newRow, newCol, steps + 1)));
                }
            }
        }
        return result;
    }
}