package software.daveturner.samples.dynaprog;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WalkTheGraph {
    static int bfCounter = 0;
    static int memoCounter = 0;
    static int tabCounter = 0;

    Map<MyPoint, Integer> m = new HashMap<>();
    public int recursionCountPaths(int row, int col) {
        if (row == 0 || col == 0) { return 0; }
        if (row == 1 || col == 1) { return 1; }
        bfCounter++;
        return recursionCountPaths(row - 1, col) + recursionCountPaths(row, col - 1);
    }

    public int memoCountPaths(int row, int col) {
        if (row == 0 || col == 0) { return 0; }
        if (row == 1 || col == 1) { return 1; }
        MyPoint o   = new MyPoint(row, col);
        if(m.containsKey(o)) { return m.get(o); }
        memoCounter++;
        m.put(o, memoCountPaths(row - 1, col) + memoCountPaths(row, col - 1));
        return memoCountPaths(row, col);
    }

    public int tabCountPaths(int rows, int cols) {
        int[][] dp = new int[rows][cols];

        // Initialize the first row and column
        for (int i = 0; i < rows; i++) {
            dp[i][0] = 1;
            tabCounter++;
        }
        for (int j = 0; j < cols; j++) {
            dp[0][j] = 1;
            tabCounter++;
        }

        // Fill the rest of the table
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                tabCounter++;
            }
        }

        return dp[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        WalkTheGraph o =  new WalkTheGraph();
        bfCounter = 0;
        memoCounter = 0;
        tabCounter = 0;
        System.out.println(o.recursionCountPaths(3, 3));
        System.out.println("what does counter say? " + bfCounter);
        System.out.println(o.memoCountPaths(3, 3));
        System.out.println("what does counter say? " + memoCounter);
        System.out.println(o.tabCountPaths(3, 3));
        System.out.println("what does counter say? " + tabCounter);

    }


    class MyPoint {
        private final int col;
        private final int row;

        public MyPoint(int row, int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            MyPoint myPoint = (MyPoint) o;
            return col == myPoint.col && row == myPoint.row;
        }

        @Override
        public int hashCode() {
            return Objects.hash(col, row);
        }
    }


}
