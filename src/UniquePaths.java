import java.util.Arrays;

public class UniquePaths {

    public UniquePaths() {}

    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++)
            dp[i][0] = 1;

        for (int i = 0; i < n; i++)
            dp[0][i] = 1;

        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
//        int[] row = new int[n];
//        Arrays.fill(row, 1);
//
//        for (int i = m - 1; i >= 1; i--) {
//            int[] newRow = new int[n];
//            Arrays.fill(newRow, 1);
//            for (int j = n - 2; j >= 0; j--)
//                newRow[j] = newRow[j + 1] + row[j];
//            row = newRow;
//        }

        return dp[m - 1][n - 1];
    }
}
