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
// Time Complexity = O(log m*n)
