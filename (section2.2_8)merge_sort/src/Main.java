public class Main {

    public static void main(String args[])
    {
        int arr[] = {  33, 54, 5, 6, 88, 0, 13, 45, 9 };

        divide(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void divide(int arr[], int l, int r){
        if (l < r){

            int mid = l + (r - l) /2;

            divide(arr, l, mid);
            divide(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {

        int leftSize = mid - l + 1;
        int rightSize = r - mid;

        int rightArr[] = new int[rightSize];
        int leftArr[] = new int[leftSize];

        for (int i = 0; i < leftSize; i++)
            leftArr[i] = arr[i + l];
        for (int i = 0; i < rightSize; i++)
            rightArr[i] = arr[mid + 1 + i];

        int i = 0, j = 0;
        int k = l;
        while (i < leftSize && j < rightSize){
            if (leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
            }
            else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < rightSize) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
}
