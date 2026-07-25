class Solution {

    int[][] isConnected;
    boolean[] visited;
    int l;

    public int findCircleNum(int[][] isConnected) {
        this.isConnected = isConnected;
        l = isConnected.length;
        visited = new boolean[l];
        int province = 0;

        for (int i = 0; i < l; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            fn(i);
            province++;
        }
        return province;
    }

    public void fn(int num) {
        for (int i = 0; i < l; i++) {
            if (visited[i]) continue;
            if (isConnected[num][i] == 1) {
                visited[i] = true;
                fn(i);
            }
        }
    }
}