//public class RecursiveChainedMatrixMultiplication {
//    public int recursiveChain(int p, int i, int j){
//
//        int[][] m = new int[i][j] ;
//
//        if (i == j) return 0;
//        m[i][j] = 111;
//        for (int k=i; k<=j-1; k++){
////            int temp = recursiveChain(p, i, k) + recursiveChain(p, k+1, j) +
//        }
//    }
//}


class MatrixOrderOptimization {
    protected int[][] m;
    protected int[][] s;

    public void matrixChainOrder(int[] dims) {
        int n = dims.length - 1;
        m = new int[n][n];
        s = new int[n][n];

        for (int t = 1; t < n; t++) {
            for (int i = 0; i < n - t; i++) {
                int j = i + t;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + dims[i] * dims[k + 1] * dims[j + 1];
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                        s[i][j] = k;
                    }
                }
            }
        }
    }
}