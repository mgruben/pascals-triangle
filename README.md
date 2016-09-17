# pascals-triangle 
Given an integer, return that many rows of Pascal's Triangle

For example:
```
5 -> [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]
```

This project makes use of triangular indexing, as follows:
```
     [0]  [1]             [2]               [3]        ... [m] {j}
[0]   1
[1]   1    1
[2]   1    2               1
[3]   1    3               3                 1
...
[n]   1 1+[n-1][1] [n-1][1]+[n-1][2] [n-1][2]+[n-1][3] ...  1
{i}
```

This project was completed for [LeetCode - Problem 118](https://leetcode.com/problems/pascals-triangle/).

I recommend that this code should only be viewed _after_ you've completed your own implementation.  
If you're super stuck, take a break, take a walk, and it will come to you; good luck.
