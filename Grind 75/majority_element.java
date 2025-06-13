class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int n = nums.length;
        // for(int i : nums){
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        //     if(map.get(i) > (n/2)){
        //         return i;
        //     }
        // }
        // return nums[0];
        int count = 0;
        int candidate = 0;
        for (int i : nums){
            if(count == 0){
                candidate = i;
            }
            count += (i == candidate) ? 1 : -1;
        }
        return candidate;
    }
}