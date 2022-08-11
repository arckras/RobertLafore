package io.metadevs.akrasilnikov.module_2_5;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

class ArraySortingTest {
    @Test
    void bubbleSortingShouldSortArrayIntoAscendingOrder() {
        ArraySorting arraySorting = filledArraySorting();
        int[] sortedArray = arraySorting.bubbleSort();
        eachPreviousElementShouldBeLessThanNextElement(sortedArray);
    }

    @Test
    void insertSortingShouldSortArrayIntoAscendingOrder() {
        ArraySorting arraySorting = filledArraySorting();
        int[] sortedArray = arraySorting.insertSort();
        eachPreviousElementShouldBeLessThanNextElement(sortedArray);
    }

    @Test
    void selectSortingShouldSortArrayIntoAscendingOrder() {
        ArraySorting arraySorting = filledArraySorting();
        int[] sortedArray = arraySorting.selectSort();
        eachPreviousElementShouldBeLessThanNextElement(sortedArray);
    }

    private ArraySorting filledArraySorting() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random().nextInt(100));
        }
        return new ArraySorting(array);
    }

    private void eachPreviousElementShouldBeLessThanNextElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            assertThat(array[i] <= array[i + 1]).isEqualTo(true);
        }
    }
}