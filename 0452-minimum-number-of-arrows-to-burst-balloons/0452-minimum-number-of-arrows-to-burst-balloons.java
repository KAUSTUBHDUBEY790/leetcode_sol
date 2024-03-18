class Solution {
    public int findMinArrowShots(int[][] points) {

        if (points.length == 0) return 0;

        // Sort the balloons based on their end coordinates
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1])); // N(logN) time
        int arrow = 1;
        int end = points[0][1]; // End of first balloon

        // Iterate through the sorted balloons to find the minimum number of arrows needed by finding non-overlapping intervals
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) { // // If the start of the current balloon is greater than the end of the previous balloon
                arrow++;
                end = points[i][1]; // Update the end with the curr balloon's end
            } else if (points[i][0] <= end) { // If there is an overlap between the current balloon and the previous one
                end = Math.min(points[i][1], end);
            }
        }
        return arrow;
    }
}