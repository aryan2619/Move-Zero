//Leetcode's Move Zero problem where we need to move the 0's in the array to the last of array keeping it's relative order as it is. I have solved it using both approaches Brute Force(O(n^2)) and Optimized(O(n)) in Java.
class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp= new int[nums.length];
        int index=0;
        for(int num:nums){
            if(num!=0){
                temp[index++]=num;
            }
        }
        System.arraycopy(temp,0,nums,0,nums.length);
    }
}
