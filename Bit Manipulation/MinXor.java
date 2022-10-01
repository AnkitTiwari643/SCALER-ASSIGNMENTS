/*
Min XOR value
Problem Link - https://practice.geeksforgeeks.org/problems/minimum-xor-value-pair/0
Problem Description
Given an integer array A of N integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.


Problem Constraints
2 <= length of the array <= 100000
0 <= A[i] <= 10^9


Input Format
First and only argument of input contains an integer array A.


Output Format
return a single integer denoting minimum xor value.


Example Input
Input 1:
A = [0, 2, 5, 7]
Input 2:
A = [0, 4, 7, 9]
    


Example Output
Output 1:
2
Output 2:
3
    


Example Explanation
 Explanation 1: 0 xor 2 = 2
*/

static int minxorpair(int N, int arr[]){
        ArrayList<Integer> temp = new ArrayList<>();
        Arrays.sort(arr);
        for(int i=1; i<N; i++) {
            temp.add((arr[i-1]^arr[i]));
        }
        
        int res = temp.get(0);
        for(int i=1; i<temp.size(); i++) {
            res = Math.min(res, temp.get(i));
        }
       return res;
}