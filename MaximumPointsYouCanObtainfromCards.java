class MaximumPointsYouCanObtainfromCards {
    public static void main(String[] args) {
        MaximumPointsYouCanObtainfromCards m = new MaximumPointsYouCanObtainfromCards();
        int cardPoints[] = { 1, 2, 3, 4, 5, 6, 1 };
        int k = 3;
        System.out.println(m.maxScore(cardPoints, k));
    }

    public int maxScore(int[] cardPoints, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int maxVal = sum, n = cardPoints.length, i = 0;
        while (i < k) {
            sum = sum - cardPoints[k - i - 1] + cardPoints[n - i - 1];
            maxVal = Math.max(maxVal, sum);
        }
        return maxVal;
    }
}