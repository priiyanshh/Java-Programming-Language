import java.util.*;

public class SearchInSortedMatrix {

    public static boolean sortedMatrixSearch(int[][] mat, int x) {
        int n = mat.length;
        int m = mat[0].length;

        // Compare each element one by one
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == x) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 5, 9, 11},
            {14, 20, 21, 26},
            {30, 34, 43, 50}
        };
        if (sortedMatrixSearch(mat, 14)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}