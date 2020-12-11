package com.intro;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();

        int[] i = new int[]{11,22,34,55,56,95,98,99,101};
        System.out.println(bs.binarySearch(i, 95));
    }

    public int binarySearch(int arr[], int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {

            int m = l + (r - l) / 2;

// Check if x is present at mid
            if (arr[m] == x)
                return m;

// If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

// If x is smaller, ignore right half
            else
                r = m - 1;
        }

// if we reach here, then element was
// not present
        return -1;
    }

}
