/*
Reverse Bits
Problem Description
Reverse the bits of an 32 bit unsigned integer A.


Problem Constraints
0 <= A <= 2^32



Input Format
First and only argument of input contains an integer A.


Output Format
Return a single unsigned integer denoting minimum xor value.


Example Input
Input 1:
0
Input 2:
3



Example Output
Output 1:
0
Output 2:
3221225472



Example Explanation
Explanation 1:
00000000000000000000000000000000
=>      00000000000000000000000000000000
Explanation 2:
00000000000000000000000000000011
=>       11000000000000000000000000000000

*/

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseBits(n));
    }
    public static int reverseBits(int n) {
        int res=0;
        for(int i=1; i<=32; i++) {
            int temp = (n&1);
            res = (res|(temp<<(32-i)));
            n = n>>1;
        }
        return res;
    }
}