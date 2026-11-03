class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] answer = new int[nums.length*2];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            answer[idx]=nums[i];
            idx++;
        }

        for(int i=0;i<nums.length;i++){
            answer[idx]=nums[i];
            idx++;
        }

        return answer;
    }
}