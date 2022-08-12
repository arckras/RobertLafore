package io.metadevs.akrasilnikov.module_2_5;

public class ArraySorting {
    private final int[] array;
    public ArraySorting(int[] array) {
        this.array = array;
    }
    public int[] bubbleSort() {
        int[] sortingArray = arrayCopy();
        for (int i = sortingArray.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (sortingArray[j] > sortingArray[j + 1]) {
                    swap(sortingArray, j, j + 1);
                }
            }
        }
        return sortingArray;
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
