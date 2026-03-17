import java.util.Arrays;

void main() {
    int[] arr = {38, 27, 43, 10};

    mergeSort(arr);

    for (int j : arr)
        System.out.print(j + " ");
}

static void mergeSort(int[] arr) {
    if (arr.length <= 1) return;

    int half = arr.length / 2;
    int[] arrayLeft = Arrays.copyOfRange(arr, 0, half);
    int[] arrayRight = Arrays.copyOfRange(arr, half, arr.length);

    mergeSort(arrayLeft);
    mergeSort(arrayRight);

    merge(arr, arrayLeft, arrayRight);
}

static void merge(int[] arr, int[] arrL, int[] arrR) {
    int indexLeft = 0;
    int indexRight = 0;
    int indexMerge = 0;

    while (indexLeft < arrL.length && indexRight < arrR.length) {
        if (arrL[indexLeft] <= arrR[indexRight]) {
            arr[indexMerge++] = arrL[indexLeft++];
        } else {
            arr[indexMerge++] = arrR[indexRight++];
        }
    }

    while (indexLeft < arrL.length) {
        arr[indexMerge++] = arrL[indexLeft++];
    }

    while (indexRight < arrR.length) {
        arr[indexMerge++] = arrR[indexRight++];
    }
}