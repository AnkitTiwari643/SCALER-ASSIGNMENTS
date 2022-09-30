/*
Single Number
Problem Description

Problem link - https://practice.geeksforgeeks.org/problems/single-number1014/1
https://leetcode.com/problems/single-number/

Given an array of integers, every element appears twice except for one. Find that single one.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without
using extra memory?


Problem Constraints
2 <= N <= 2000000
0 <= A[i] <= INT_MAX



Input Format
First and only argument of input contains an integer array A.


Output Format
Return a single integer denoting the single element.


Example Input
Input 1:
A = [1, 2, 2, 3, 1]
Input 2:
A = [1, 2, 2]



Example Output
Output 1:
3
Output 2:
1



Example Explanation
3 occurs only once. So the answer is 3.
*/

public int singleNumber(int[] nums) {
    int res=0;
    for(int i=0; i<nums.length; i++) {
        res = (res^nums[i]);
    }
    return res;
}