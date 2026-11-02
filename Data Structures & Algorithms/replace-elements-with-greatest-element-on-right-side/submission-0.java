class Solution {
    public int[] replaceElements(int[] arr) {
        int maxNum = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                maxNum = arr[i];
                arr[i] = -1;
                continue;
            }

            int currMax = Math.max(maxNum, arr[i]);
            arr[i] = maxNum;
            maxNum = currMax;
        }

        return arr;
    }
}