package io.metadevs.akrasilnikov.module_2_7;

import org.junit.jupiter.api.Test;
import java.util.Random;
import static org.assertj.core.api.Assertions.assertThat;

class InsertSortingTest {
    @Test
    void insertSorting() {
        ArrayInsertSelectSorting array = unsortedArray();
        int[] sortedArray = array.insertSort();
        eachPreviousElementShouldBeLessThanNextElement(sortedArray);
    }

       private ArrayInsertSelectSorting unsortedArray() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random().nextInt(100));
        }
        return new ArrayInsertSelectSorting(array);
    }

    private void eachPreviousElementShouldBeLessThanNextElement(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            assertThat(array[i] <= array[i + 1]).isEqualTo(true);
        }
    }
}