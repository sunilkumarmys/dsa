package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class two_sum {

    /*
    You are given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
     */

    public static void main(String[] args) {
        int[] intArray = new int[] {2,3,4,5,6};
        int target = 9;
        int[] ints = twoSum(intArray, target);
        Arrays.stream(Objects.requireNonNull(ints)).boxed().forEach(System.out::println);

        int[] ints1 = twoSum_solution2(intArray, target);
        Arrays.stream(Objects.requireNonNull(ints1)).boxed().forEach(System.out::println);


    }
//solution 1 - creating two pointers and moving one pointer at a time to compare two values if target is achieved then return int[]

    public static int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            for (int j = 1; j < nums.length; j++) {
                if (num + nums[j] == target) {
                    return new int[]{num, nums[j]};
                }
            }
        }
        return null;
    }

    public static int[] twoSum_solution2(int[] nums, int target) {
        Map<Integer,Integer> container = new HashMap<>();
        for (int i=0; i<nums.length;i++){
            int result = target - nums[i];
            if(container.containsKey(result)){
                return new int[]{container.get(result), i};
            }
            container.put(nums[i],i);
        }

        return new int[]{};
    }



}
