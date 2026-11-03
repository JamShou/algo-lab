class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> scores = new Stack<>();

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    scores.push(scores.get(scores.size() - 1) + scores.get(scores.size() - 2));
                    break;
                case "D":
                    scores.push(scores.peek() * 2);
                    break;
                case "C":
                    scores.pop();
                    break;
                default:
                    scores.push(Integer.parseInt(operation));
            }
        }

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }
}