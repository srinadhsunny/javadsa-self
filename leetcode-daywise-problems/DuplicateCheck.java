

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            // If num already exists in the set, it's a duplicate
            if (seen.contains(num)) return true;
            seen.add(num);
        }
        return false; // no duplicates found
    }
}
