public class Search2D {

    public Search2D() {};


    public boolean searchMatrix(int[][] matrix, int target) {

        int length = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == target || matrix[i][length - 1] == target)
                return true;
            if (matrix[i][0] < target && matrix[i][length - 1] > target) {
                int l = 0, r = length - 2;

                while (l <= r) {
                    int mid = (l + r) / 2;

                    if (matrix[i][mid] == target) return true;
                    if (matrix[i][mid] < target) l = mid + 1;
                    else r = mid - 1;
                }
            }
        }

        return false;
    }

}
