import java.util.Arrays;

public class MaximumUnitsonaTruck {
    public static void main(String[] args) {
        MaximumUnitsonaTruck m = new MaximumUnitsonaTruck();
        int boxTypes[][] = { { 5, 10 }, { 2, 5 }, { 4, 7 }, { 3, 9 } };
        int truckSize = 10;

        System.out.println(m.maxiunits(boxTypes, truckSize));
    }

    public int maxiunits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int maxbox = 0;
        for (int[] i : boxTypes) {
            int noOfboxes = i[0];
            int noOfunits = i[1];

            if (truckSize >= noOfboxes) {
                maxbox += noOfboxes * noOfunits;
                truckSize -= noOfboxes;
            } else {
                maxbox += truckSize * noOfunits;
                return maxbox;
            }

        }
        return maxbox;
    }
}
