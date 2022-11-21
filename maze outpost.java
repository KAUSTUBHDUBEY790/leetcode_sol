class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int m = maze.length;
        int n = maze[0].length;

        boolean[] visited = new boolean[m * n];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(entrance);
        visited[entrance[0] * n + entrance[1]] = true;

        int step = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] curPos = queue.poll();

                int x = curPos[0];
                int y = curPos[1];

                for (int[] dir : dirs) {
                    int nextX = x + dir[0];
                    int nextY = y + dir[1];

                    if (nextX < 0 || nextX >= m || nextY < 0 || nextY >= n) {
                        if (x != entrance[0] || y != entrance[1]) {
                            return step;
                        }

                        continue;
                    }

                    if (maze[nextX][nextY] == '+') {
                        continue;
                    }

                    if (visited[nextX * n + nextY]) {
                        continue;
                    }

                    visited[nextX * n + nextY] = true;
                    queue.offer(new int[]{nextX, nextY});
                }
            }

            step++;
        }

        return -1;
    }
}
