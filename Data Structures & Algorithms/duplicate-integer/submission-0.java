class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> duplicate = new HashMap<>();
        boolean hasAlice = false;
        for(int i = 0; i< nums.length; i++){
            hasAlice = duplicate.containsKey(nums[i]);
            if(hasAlice){
                return true;
            }
            else{
                duplicate.put(nums[i], hasAlice);
            }
        }
        return hasAlice;
    }
}