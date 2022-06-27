public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    public static void main(String[] args) {
        PartitioningIntoMinimumNumberOfDeciBinaryNumbers p = new PartitioningIntoMinimumNumberOfDeciBinaryNumbers();
        String n = "27346209830709182346";
        System.out.println(p.minPartition(n));
    }

    public int minPartition(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            ans = Math.max(ans, n.charAt(i) - '0');
        }
        return ans;
    }
}
