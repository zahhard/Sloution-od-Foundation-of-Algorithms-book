import java.util.Arrays;

public class Main {

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int [] arr, int l, int r) {
        int temp = arr[r];
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (arr[j] <= temp) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);

        return i+1;
    }


    public static void quickSort(int[] arr, int l, int r){


        if( l < r ){

            int q = partition(arr, l, r);

            quickSort(arr, l, q - 1);
            quickSort(arr, q + 1, r);
        }

    }

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quickSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
