import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        float arr[] = new float[] { 0.375f, 0.375f, 0.125f, 0.125f };
        System.out.println(Arrays.deepToString(optimalBST(4, arr)));

    }

    public static int[][] optimalBST(int n, float[] p) {

        float[][] a = new float[n + 1][n];
        int[][] r = new int[n + 1][n];

        for (int i = 1; i <= n; i++) {
            a[i][i - 1] = 0;
            a[i][i] = p[i];
            r[i][i] = i;
            r[i][i - 1] = 0;
        }
        a[n + 1][n] = 0;
        r[n + 1][n] = 0;

        for (int t = 1; t <= n; t++) {
            for (int i = 1; i <= n - t; i++) {
                int j = i + t;
                float min = 0;
                for (int k = i; k <= j; j++) {
                    float temp = 0;
                    for (int y = i; y <= j; y++){
                        temp = p[y] + temp;
                    }
                    float sum = a[i][k-1] + a[k+1][j] + temp;
                    if (sum < min) {
                        min = sum;
                        r[i][j] = k;
                    }

                }
            }
        }
        return  r;
    }
}
