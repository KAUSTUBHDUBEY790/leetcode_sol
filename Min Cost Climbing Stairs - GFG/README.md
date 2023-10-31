# Min Cost Climbing Stairs
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of integers <strong>cost[]</strong> of length <strong>N</strong>, where&nbsp;<strong>cost[i]</strong>&nbsp;is the cost of the i<sup>th</sup>&nbsp;step on a staircase.&nbsp;Once&nbsp;the cost is paid, you can either climb one or two steps.<br>
You can either start from the step with index 0, or the step with index 1.<br>
Return the minimum cost to reach the top of the floor.</span><br>
<br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 3
cost[] = {10, 15, 20}
<strong>Output:
</strong>15<strong>
Explanation:
<img alt="" src="https://media.geeksforgeeks.org/img-practice/746_1-1629788354.png" style="height:450px; width:800px">
</strong>Cheapest option is to start at cost[1],
pay that cost, and go to the top.
</span></pre>

<p>&nbsp;</p>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 10
arr[] = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}
<strong>Output:
</strong>6<strong>
Explanation:
</strong>Cheapest option is to start on cost[0], 
and only step on 1s, skipping cost[3].</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>minCostClimbingStairs</strong>() which takes an array&nbsp;<strong>cost[] </strong>as&nbsp;input<strong>&nbsp;</strong>and returns the minimum cost to reach the top.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span><br>
<br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
2 ≤ N ≤ 10<sup>3</sup><br>
0&nbsp;≤ cost[i] ≤ 999</span></p>

<p>&nbsp;</p>
</div>