// Time Complexity = O(log m*n)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<= matrix.length -1; i++)
        {
            for(int j =0; j<= matrix[i].length-1; j++){
                int left = 0, right = matrix[i].length-1;
                while(left <= right){
                    int mid = (left + right)/2;
                    if(matrix[i][mid] == target)
                        return true;
                    else if(matrix[i][mid] < target)
                        left = mid + 1;
                    else if(matrix[i][mid] > target)
                        right = mid - 1;
                }
            }
        }
        return false;
    }
}

// Time Complexity = O(log(m*n))
// Treats the 2-D matrix as a 1-D array and maps the 1-D index to 2-D row & col
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0, right = m*n-1;
        while(left <= right){
            int mid = (left + right)/2;
            int row = mid / n;
            int col = mid % n;
            int midVal = matrix[row][col];

            if (midVal == target)
                return true;
            else if(midVal < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
}

// Time Complexity = O(m+n)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0, col = n - 1;  // start at top-right corner

        while (row < m && col >= 0) {
            int val = matrix[row][col];

            if (val == target) {
                return true;
            } else if (val > target) {
                col--;  // eliminate this column
            } else {
                row++;  // eliminate this row
            }
        }

        return false;
    }
}
