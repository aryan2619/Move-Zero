//Leetcode's Move Zero problem where we need to move the 0's in the array to the last of array keeping it's relative order as it is. I have solved it using both approaches Brute Force(O(n)) and Optimized(O(n)) in Java.
//Here we are not using an extra array just like we used in Brute force approach, here in a single array we did the solution.
class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos=0;
        for(int num:nums){
            if(num!=0){
                nums[insertPos++]=num;
            }
        }
        while(insertPos<nums.length){
            nums[insertPos++]=0;
        }
    }
}
