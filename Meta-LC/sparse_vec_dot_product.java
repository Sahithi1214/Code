class SparseVector {
    Map<Integer, Integer> map;
    
    SparseVector(int[] nums) {
        map = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(nums[i] != 0){
                map.put(i, nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        Map<Integer, Integer> smaller = this.map.size() < vec.map.size() ? this.map : vec.map;
        Map<Integer, Integer> larger = this.map.size() < vec.map.size() ? vec.map : this.map;
        int product = 0;
        for(int key : smaller.keySet()){
            if(larger.containsKey(key)){
                product += smaller.get(key) * larger.get(key);
            }
        }
        return product;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);