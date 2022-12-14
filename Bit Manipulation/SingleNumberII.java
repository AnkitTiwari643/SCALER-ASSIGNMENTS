/*
Single Number II

Problem Link - https://leetcode.com/problems/single-number-ii/

Problem Description
Given an array of integers, every element appears thrice except for one which occurs once.

Find that element which does not appear thrice.

Note: Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?



Problem Constraints
2 <= A <= 5 000 000
0 <= A <= INT_MAX
        


Input Format
First and only argument of input contains an integer array A.


Output Format
Return a single integer.


Example Input
Input 1:
A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
Input 2:
A = [0, 0, 0, 1]
      


Example Output
Output 1:
4
Output 2:
1
      


Example Explanation
Explanation:
4 occurs exactly once in Input 1.
1 occurs exactly once in Input 2.
*/

public int singleNumber(int[] nums) {
        int res=0;
        for(int i=0; i<32; i++) {
            int setBits=0;
            for(int j=0; j<nums.length; j++) {
                if((nums[j]&1)==1) {
                    setBits++;
                }
                nums[j] = nums[j]>>1;
            }
            if(setBits%3!=0){
                res = (res|(1<<i));
            }
        }
        return res;
    }