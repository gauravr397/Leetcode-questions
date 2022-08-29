
import java.util.*;

public class BleakNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        String arr2[] = new String[n];
        Arrays.fill(arr2, "BLEAK");
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < arr[i]; j++) {
                if (j + Integer.bitCount(j) == arr[i]) {
                    arr2[i] = "SUPPORTED";
                    // System.out.println(Arrays.toString(arr2));
                }
                // else{
                // arr2[i]="BLEAK";
                // //System.out.println(Arrays.toString(arr2));
                // }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
