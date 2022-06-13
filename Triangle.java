import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Triangle {
    // { { 2 }, { 3, 4 }, { 6, 5, 7 }, { 4, 1, 8, 3 } }
    // List<List<Integer>> triangle = new ArrayList<List<Integer>>();
    // List<Integer> list0 = new ArrayList<Integer>();
    // list0.add(2);
    // List list1=new ArrayList();
    // list1.add("List1_Str1");
    // list1.add("List1_Str2");

    // List list2=new ArrayList();
    // list2.add("List2_Str1");
    // list2.add("List2_Str2");
    // list2.add("List2_Str3");

    // // Create third list
    // List list3=new ArrayList();
    // list3.add("List3_Str1");
    // list3.add("List3_Str2");
    // list3.add("List3_Str3");
    // list3.add("List3_Str4");

    Triangle t = new Triangle();System.out.println(t.minimumTotal(triangle));
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int res[] = new int[n + 1];
        for (int row = n - 1; row >= 0; row--) {
            int rowelement = triangle.get(row).size();
            for (int col = 0; col < rowelement; col++) {
                res[col] = triangle.get(row).get(col) + Math.min(res[col], res[col + 1]);
            }
        }
        return res[0];
    }
}
