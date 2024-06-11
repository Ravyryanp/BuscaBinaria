package Modelo;

public class BinarySearchModel {
    private int[] sortedArray;

    public BinarySearchModel(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public int binarySearch(int key) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (sortedArray[mid] == key)
                return mid;
            else if (sortedArray[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }
}
