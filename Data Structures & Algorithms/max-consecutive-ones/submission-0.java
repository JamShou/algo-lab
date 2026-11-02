class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int answer = 0;
        int maxAnswer = 0;

        for (int num : nums) {
            if (num == 1) {
                answer++;
            } else {
                maxAnswer = Math.max(maxAnswer, answer);
                answer = 0;
            }
        }

        maxAnswer = Math.max(maxAnswer, answer);

        return maxAnswer;
    }
}