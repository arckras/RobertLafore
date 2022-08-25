package io.metadevs.akrasilnikov.module_2_7;

public class ArraySorting {
    private final int[] array;

    public ArraySorting(int[] array) {
        this.array = array;
    }

    public int[] insertSort() {
        int[] sortedArray = arrayCopy();
        for (int i = 1; i < sortedArray.length; i++) {
            int temporary = sortedArray[i];
            int j = i;
            while (j > 0 && sortedArray[j - 1] >= temporary) {
                sortedArray[j] = sortedArray[j - 1];
                j--;
            }
            sortedArray[j] = temporary;
        }
        return sortedArray;
    }

    public int[] selectSort() {
        int[] sortedArray = arrayCopy();
        int minimal;
        for (int i = 0; i < sortedArray.length - 1; i++) {
            minimal = i;
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < sortedArray[minimal]) {
                    minimal = j;
                }
            }
            swap(sortedArray, i, minimal);
        }
        return sortedArray;
    }

    private int[] arrayCopy() {
        int[] arrayCopy = new int[array.length];
        for (int i = 0; i < arrayCopy.length; i++) {
            arrayCopy[i] = array[i];
        }
        return arrayCopy;
    }

    private void swap(int[] array, int index1, int index2) {
        int temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
    }
}
