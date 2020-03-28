/**Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself. */


class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
    int len = digits.length;
    for(int i = len - 1; i>=0; i--) {
        digits[i] = digits[i] + carry;
        carry = 0;
        if(digits[i] >=10) {
            carry = 1;
            digits[i] = 0;
        }
    }
    if(carry > 0) {
        int[] res = new int[digits.length + 1]; //if there is a carry at first element
        res[0] = 1;
        return res;
    }
    return digits;

    }
}