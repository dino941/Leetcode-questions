class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n = grid[0].length;
        int c = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    c++;
                    dfs(grid, i, j);
                }
            }
        }
        return c;
    }

    void dfs(char[][] arr, int i, int j) {
        int m = arr.length, n = arr[0].length;
        if (i < 0 || j < 0 || j >= n || i >= m || arr[i][j] == '0') {
            return;
        }
        arr[i][j] = '0';
        dfs(arr, i - 1, j);
        dfs(arr, i + 1, j);
        dfs(arr, i, j - 1);
        dfs(arr, i, j + 1);
    }
}