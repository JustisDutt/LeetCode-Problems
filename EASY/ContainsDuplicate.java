//Create hashset, loop through array nums, if nums[i] is in hashset seen, return true
// else, add nums[i] to seen. return false if loop through entire list and do not get a duplicate.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

    for(int i=0; i<nums.length;i++) {
      
        if(seen.contains(nums[i])) {
            return true;
        }
        seen.add(nums[i]);
    }
    return false;
    }
}
