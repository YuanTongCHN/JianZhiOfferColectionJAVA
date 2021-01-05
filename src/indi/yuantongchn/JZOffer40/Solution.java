package indi.yuantongchn.JZOffer40;

import java.util.Arrays;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k > arr.length || k == 0) {
            return new int[0];
        }
        return quickSort(arr, k, 0, arr.length - 1);
    }
    private int[] quickSort(int[] arr, int k, int start, int end) {
        int r = partition(arr, start, end);
        if (r == k - 1) {
            return Arrays.copyOfRange(arr, 0, k);
        } else if (r < k - 1) {
            return quickSort(arr, k, r + 1, end);
        } else {
            return quickSort(arr, k, start, r - 1);
        }
    }
    private int partition(int[] arr, int start, int end) {
        int l;
        int r;
        while (true) {
            for (l = start + 1; l <= end; l++) {
                if (arr[l] > arr[start]) {
                    break;
                }
            }
            for (r = end; r > start; r--) {
                if (arr[r] < arr[start]) {
                    break;
                }
            }
            if (l < r) {
                swap(arr, l, r);
            } else {
                break;
            }
        }
        swap(arr, start, r);
        return r;
    }
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

















