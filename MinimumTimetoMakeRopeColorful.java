public class MinimumTimetoMakeRopeColorful {
    // 1578. Minimum Time to Make Rope Colorful
    public static void main(String[] args) {
        String color = "aabaa";
        int neededTime[] = { 1, 2, 3, 4, 1 };
        MinimumTimetoMakeRopeColorful m = new MinimumTimetoMakeRopeColorful();
        System.out.println(m.minCost(color, neededTime));
    }

    public int minCost(String color, int[] neededTime) {
        int n = color.length();
        int ans = 0, curr = 0, next = 1;
        while (next < n) {
            if (color.charAt(curr) == color.charAt(next)) {
                if (neededTime[curr] <= neededTime[next]) {
                    ans += neededTime[curr];
                    curr = next;
                    next++;
                } else {
                    ans += neededTime[next];
                    next++;
                }
            } else {
                curr = next;
                next++;
            }
        }
        return ans;
    }
}
