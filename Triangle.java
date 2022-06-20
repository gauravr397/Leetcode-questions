import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Triangle {
    // { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } }

    Triangle t = new Triangle();System.out.println(t.minimumTotal(triangle));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size(); // triange list size
        int res[] = new int[n + 1]; // new array of size greater thhn arraylist
        for (int row = n - 1; row >= 0; row--) { // Bottum up traversal i=3 then i=2 ,i=1 ,i=0
            int rowelement = triangle.get(row).size(); // for number of element in i row traversal will change for each
                                                       // i iteration
            for (int col = 0; col < rowelement; col++) { // colunm taversal
                res[col] = triangle.get(row).get(col) + Math.min(res[col], res[col + 1]); // result stored at [0]
                                                                                          // position
            }
        }
        return res[0];
    }
}
